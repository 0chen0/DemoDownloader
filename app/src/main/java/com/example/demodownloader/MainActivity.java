package com.example.demodownloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.demodownloader.recyclerview.DemoRecyclerViewFragment;
import com.example.demodownloadercore.DownloaderCore;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			DemoRecyclerViewFragment fragment = new DemoRecyclerViewFragment();
			transaction.replace(R.id.sample_content_fragment, fragment);
			transaction.commit();
		}
	}

	public void startAll(View v) {
		System.out.println("开始下载全部");
		DownloaderCore.getInstance().startDownloadAll();
	}
}
