package com.jiangjg.lib.JavaConcurrencyinPractice.TH0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;

class Container {  
	  public volatile int no = 2;  
}

public class UnsafeSequence {
	private Container c = new Container();
	private int value;
	private final AtomicLong countAtomicLong = new AtomicLong(0);
	private AtomicIntegerFieldUpdater<Container> updater =  
		    AtomicIntegerFieldUpdater.newUpdater(Container.class, "no");  
	
	/*
	 * ȷ��TimerTask���ʵĶ��������̰߳�ȫ�ģ��Ӷ����ܰ��̰߳�ȫ�Է�װ�ڹ�������ڲ�
	 * ��ʵ�����ַ����޸�������⣺
	 * 1.�����߳�֮�乲���״̬����
	 * 2.��״̬�����޸�Ϊ���ɱ�ı���
	 * 3.�ڷ���״̬����ʱʹ��ͬ��
	 */
	
	public int getNext(){
		return updater.incrementAndGet(c);
		//return countAtomicLong.incrementAndGet();
		//return value++;
	}

}
