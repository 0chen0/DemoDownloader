package com.example.demodownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.demodownloadercore.DownloaderCore;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void startAll(View v) {
		System.out.println("开始下载全部");
		DownloaderCore.getInstance().startDownloadAll();
	}
}
