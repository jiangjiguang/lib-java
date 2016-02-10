package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		try {
			System.out.println("start....");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("finaal");
		}
		
	}

}
