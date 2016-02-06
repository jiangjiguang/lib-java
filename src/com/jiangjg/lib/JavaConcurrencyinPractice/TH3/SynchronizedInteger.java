package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;
//�̰߳�ȫ
/*
 * �����ĺ��岻���������ڻ�����Ϊ���������ڴ�ɼ��ԡ�Ϊ��ȷ�������̶߳��ܿ����������������ֵ��
 * ����ִ�ж���������д�������̶߳�������ͬһ������ͬ��
 * �������Ƽȿ���ȷ���ɼ����ֿ���ȷ��ԭ���ԣ���volatile����ֻ��ȷ���ɼ���
 * volatile����ʹ�õ�������
 * 1.�Ա�����д����������������ĵ�ǰֵ����������ȷ��ֻ�е����̸߳��±�����ֵ
 * 2.�ñ�������������״̬����һ�����벻����������
 * 3.�ڷ��ʱ���ʱ����Ҫ����
 */
public class SynchronizedInteger {

	private int value;

	public synchronized int getValue() {
		return value;
	}

	public synchronized void setValue(int value) {
		this.value = value;
	}
}
