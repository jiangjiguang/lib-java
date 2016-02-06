package com.jiangjg.lib.JavaConcurrencyinPractice.TH0;

public class UnsafeSequenceTest {
	//只有当多个线程访问共同的对象时，才可能发生并发性问题
	public static void main(String[] args) {
		UnsafeSequence unsafeSequence = new UnsafeSequence();
		Thread thread1 = new Thread(new UnsafeSequenceThread(1000000,unsafeSequence));
		thread1.start();
		Thread thread2 = new Thread(new UnsafeSequenceThread(1000000,unsafeSequence));
		thread2.start();
	}

}

