package com.example.demodownloadercore;

import java.util.LinkedHashMap;
import java.util.Map;

public class DownloaderCore {

	private static DownloaderCore instance;   //单例
	private LinkedHashMap<String, Downloader> downloaderList;  //下载列表<URL, 下载器>

	public static DownloaderCore getInstance() {
		if (instance == null) {
			synchronized (DownloaderCore.class) {
				if (instance == null) {
					instance = new DownloaderCore();
				}
			}
		}
		return instance;
	}

	public static void init() {

	}

	public void startDownloadAll() {
		if (downloaderList != null) {
			for (Map.Entry<String, Downloader> stringDownloaderEntry : downloaderList.entrySet()) {
				Downloader downloader = stringDownloaderEntry.getValue();
				if (downloader.getDownloadState() == DownloadState.PAUSE
				|| downloader.getDownloadState() == DownloadState.FAIL) {
					downloader.download();
				}
			}
		}

	}

	// 添加下载器        //CZH ??
	private void addDownloader(String url) {
		if (downloaderList == null) {
			downloaderList = new LinkedHashMap<>();     //CZH 初始化时创建不好吗?
		}
//		downloaderList.put(downloader.url, downloader);
	}

	//下载器
	private static class Downloader {
		private String url; //资源路径
		private DownloadState downloadState;

		DownloadState getDownloadState() { return downloadState; }

		void download() {
			System.out.println("开始下载资源, 路径为:" + url);
		}
	}

}












































