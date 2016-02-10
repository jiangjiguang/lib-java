package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.TimeUnit;

public class TestADaemon {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ADaemon());
		//thread.setDaemon(true);
		thread.start();
		//TimeUnit.MILLISECONDS.sleep(500);
	}

}
