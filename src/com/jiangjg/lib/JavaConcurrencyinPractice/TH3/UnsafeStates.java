package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

/*
 * ������ʹ�����ܹ��ڵ�ǰ������֮��Ĵ�����ʹ�á�
 * ��ĳ����Ӧ�÷����Ķ��󱻷���ʱ��������������ݳ�
 * 
 */
//ʹ�ڲ��Ŀɱ�״̬�ݳ�(��Ҫ��ô��)
//��Ҫ�ڹ��������ʹthis�����ݳ�
/*
 * 
 */
public class UnsafeStates {
	private String[] states = new String[]{
		"AK","AL"	
	};
	public String[] getStates(){
		return states;
	}
}
