package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;
/*
 * ������̰߳�ȫ��Ĺ����У���Ҫ��������Ҫ�أ�
 * 1.�ҳ����ɶ���״̬�����б���
 * 2.�ҳ�Լ��״̬�����Ĳ���������
 * 3.��������״̬�Ĳ����Է��ʹ������
 */
public final class Counter {

	private long value = 0;
	public synchronized long getValue(){
		return value;
	}
	public synchronized long increment(){
		if(value == Long.MAX_VALUE){
			throw new IllegalStateException("counter overflow");
		}
		return ++value;
	}
}
