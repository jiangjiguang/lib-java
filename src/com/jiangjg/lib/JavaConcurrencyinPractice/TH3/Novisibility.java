package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

/*
 * 为了确保多个线程之间对内存写入操作的可见性，必须使用同步机制
 * 只要有数据在多个线程之间共享，就使用正确的同步
 */
//@NotThreadSafe
public class Novisibility {
	private static boolean ready;
	private static int number;
	private static class ReaderThread extends Thread{
		public void run(){
			while(!ready){
				Thread.yield();
			}
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		new ReaderThread().start();
		ready = true;
		number = 42;
		

	}

}
