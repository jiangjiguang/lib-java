package com.jiangjg.lib.JavaConcurrencyinPractice.TH0;

public class UnsafeSequenceTest {
	//ֻ�е�����̷߳��ʹ�ͬ�Ķ���ʱ���ſ��ܷ�������������
	public static void main(String[] args) {
		UnsafeSequence unsafeSequence = new UnsafeSequence();
		Thread thread1 = new Thread(new UnsafeSequenceThread(1000000,unsafeSequence));
		thread1.start();
		Thread thread2 = new Thread(new UnsafeSequenceThread(1000000,unsafeSequence));
		thread2.start();
	}

}

