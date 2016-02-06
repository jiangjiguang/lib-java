package com.jiangjg.lib.JavaConcurrencyinPractice.TH0;

public class UnsafeSequenceThread implements Runnable{
	private static int taskCount = 0;
	private final int id = taskCount++;
	private int countDown = 10;
	public UnsafeSequenceThread(int count){
		this.countDown = count;
		unsafeSequence = new UnsafeSequence();
	}
	public UnsafeSequenceThread(int count, UnsafeSequence unsafeSequence){
		this.countDown = count;
		this.unsafeSequence = unsafeSequence;
	}
	UnsafeSequence unsafeSequence = null;
	@Override
	public void run() {
		while(countDown-- > 0){
			System.out.println("#" + id + ": " + unsafeSequence.getNext());
		}
		
	}


}
