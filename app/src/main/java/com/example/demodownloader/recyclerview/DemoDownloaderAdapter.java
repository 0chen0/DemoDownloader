package com.example.demodownloader.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demodownloader.R;


public class DemoDownloaderAdapter extends RecyclerView.Adapter<DemoDownloaderAdapter.ViewHolder>{

	private String[] mDataSet;

	public DemoDownloaderAdapter(String[] dataSet) { mDataSet = dataSet; }

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.downloader_item, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		TextView textView = (TextView) holder.downloaderView.findViewById(R.id.cardview_textview);
		textView.setText(mDataSet[position]);
	}

	@Override
	public int getItemCount() {
		return mDataSet.length;
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		private final CardView downloaderView;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			downloaderView = (CardView) itemView.findViewById(R.id.cardview);
			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					System.out.println("--@# ViewHolder " + getAdapterPosition() + " clicked.");
				}
			});
		}

	}
}
