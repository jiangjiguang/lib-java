package com.jiangjg.lib.ThingkingInJava.Th21;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		for(int i=0; i<10000000;i++){
			int a = 0;
			a++;
		}
		System.out.println("wating for");

	}

}
