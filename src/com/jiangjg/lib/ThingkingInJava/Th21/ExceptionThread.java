package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
			System.out.println("1222");
		}
		catch (Exception e){
			//e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		throw new RuntimeException();
		
	}

}
