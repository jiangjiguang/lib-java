package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++){
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
		System.out.println("123456");
	}

}
