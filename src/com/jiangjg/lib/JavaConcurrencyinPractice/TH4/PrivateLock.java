package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

/*
 * Java�ļ�����ģʽ��Ѷ�������пɱ�״̬����װ���������ɶ����Լ���������������
 */
public class PrivateLock {
	private final Object myLock = new Object();
	Integer integer = new Integer(0);
	void someMethod(){
		synchronized (myLock) {
			//���ʻ��޸�integer��״̬
		}
	}

}
