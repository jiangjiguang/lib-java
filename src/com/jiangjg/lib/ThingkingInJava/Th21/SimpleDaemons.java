package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		for(int i=0; i<10; i++){
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(false);
			daemon.start();
		}
		System.out.println("all started--------------------");
		TimeUnit.MILLISECONDS.sleep(175);

	}

	@Override
	public void run() {
		try {
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (Exception e) {
			System.out.println("sllep() interrupted");
		}
		
	}

}
