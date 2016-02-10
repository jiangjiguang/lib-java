package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DaemonThreadPoolExcutor extends ThreadPoolExecutor{
	public DaemonThreadPoolExcutor()
	{
		super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThread());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
