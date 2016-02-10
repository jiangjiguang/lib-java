package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.ThreadFactory;

public class DaemonThread implements ThreadFactory{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setDaemon(true);
		return thread;
	}

}
