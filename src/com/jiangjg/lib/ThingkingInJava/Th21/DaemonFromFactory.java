package com.jiangjg.lib.ThingkingInJava.Th21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ExecutorService exec = Executors.newCachedThreadPool(new DaemonThread());
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<10; i++){
			exec.execute(new DaemonFromFactory());
			
		}
		System.out.println(" All daemons started");
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		try
		{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + "  " + this);
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		
	}

}
