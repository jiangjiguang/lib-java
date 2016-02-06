package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.util.HashSet;
import java.util.Set;

/*
 * ������Ҫĳ�����ǿɱ�ģ�����Ӧ��������Ϊfinal�� ��һ�����õı��ϰ��
 * 
 * �ڲ���������ʹ�ú͹������ʱ������ʹ��һЩʵ�õĲ��ԣ�
 * 1.�̷߳��
 * �̷߳�յĶ���ֻ����һ���߳�ӵ�У����󱻷���ڸ��߳��У�����ֻ��������߳��޸�
 * 2.ֻ������
 * ��û�ж���ͬ��������£������ֻ����������ɶ���̲߳������ʣ����κ��̶߳������޸�����
 * �����ֻ������������ɱ�������ʵ���ɱ����
 * 3.�̰߳�ȫ����
 * �̰߳�ȫ�Ķ��������ڲ�ʵ��ͬ������˶���߳̿���ͨ������Ĺ��нӿ������з��ʶ�����Ҫ��һ����ͬ��
 * 4.��������
 * �������Ķ���ֻ��ͨ�������ض����������ʡ��������������װ�������̰߳�ȫ�����еĶ����Լ��ѷ����Ĳ�����ĳ���ض��������Ķ���
 */
public final class ThreeStooges {
	
	private final Set<String> stooges = new HashSet<String>();
	public ThreeStooges(){
		stooges.add("Moe");
		stooges.add("Larry");
		stooges.add("Curly");
	}
	public boolean isStooge(String nameString){
		return stooges.contains(nameString);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreeStooges ts = new ThreeStooges();
		//ts.stooges = new HashSet<String>();
		ts.stooges.add("aa");
		ts.stooges.remove("Moe");
		Set<String> set = ts.stooges;
		boolean re = ts.isStooge("Moe");
		System.out.println(re);

	}

}
