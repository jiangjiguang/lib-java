package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

/*
 * Ϊ��ȷ������߳�֮����ڴ�д������Ŀɼ��ԣ�����ʹ��ͬ������
 * ֻҪ�������ڶ���߳�֮�乲����ʹ����ȷ��ͬ��
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
