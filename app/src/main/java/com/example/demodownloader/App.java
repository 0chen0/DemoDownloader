package com.example.demodownloader;

import android.app.Application;
import com.example.demodownloadercore.DownloaderCore;


public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		DownloaderCore.init();
	}
}
