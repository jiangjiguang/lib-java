package com.jiangjg.lib.ThingkingInJava.Th21;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		Thread thread2 = new Thread(new LiftOff());
		thread2.start();
		for(int i=0; i<100000;i++){
			int a = 0;
			a++;
		}
		System.out.println("wating for");

	}

}
