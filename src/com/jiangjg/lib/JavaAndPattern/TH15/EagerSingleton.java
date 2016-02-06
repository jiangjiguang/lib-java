package com.jiangjg.lib.JavaAndPattern.TH15;

/*
 * ����ʽ����
 * �����ʱ��̬�����ᱻ��ʼ������Ĺ�������˽�еģ���˴��಻�ܱ��̳�
 */
public class EagerSingleton {
	
	private static final EagerSingleton m_instance = new EagerSingleton();
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return m_instance;
	}
}

