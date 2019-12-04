package com.example.demodownloader.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demodownloader.R;

public class DemoRecyclerViewFragment extends Fragment {
	protected RecyclerView mRecyclerView;
	protected DemoDownloaderAdapter mAdapter;
	protected RecyclerView.LayoutManager mLayoutManager;

	protected String[] mDataSet;
	protected int DATASET_COUNT = 40;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mDataSet = new String[DATASET_COUNT];
		for (int i=0; i<DATASET_COUNT; ++i) {
			mDataSet[i] = "The " + i + " Data. ";
		}
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		View rootView = inflater.inflate(R.layout.demo_recycler_frag, container, false);
		mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

		int scrollPosition = 0;
		if (mRecyclerView.getLayoutManager() != null) {
			scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager())
					.findFirstCompletelyVisibleItemPosition();
		}
		mLayoutManager = new LinearLayoutManager(getActivity());
		mRecyclerView.setLayoutManager(mLayoutManager);
		mRecyclerView.scrollToPosition(scrollPosition);

		mAdapter = new DemoDownloaderAdapter(mDataSet);
		mRecyclerView.setAdapter(mAdapter);
		return rootView;

	}



}
