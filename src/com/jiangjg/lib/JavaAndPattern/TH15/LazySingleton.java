package com.jiangjg.lib.JavaAndPattern.TH15;

/*
 * ����ʽ������
 * 
 */
public class LazySingleton {

	private static LazySingleton m_instance = null;
	private LazySingleton(){
		
	}
	//��������ǳ���
	synchronized public static LazySingleton getInstance(){
		if(m_instance == null){
			m_instance = new LazySingleton();
		}
		return m_instance;
	}
	
	//��������ǲ�������
	//��Ϊ��Java�ı���������ĳ�ʼ���ͱ����ĸ�ֵ��˳�򲻿�Ԥ�ϡ����һ���߳���û��ͬ�����������¶�ȡm_instance����
	//���ҵ����������ķ����Ļ������ܻᷢ�ֶ���ĳ�ʼ��������δ��ɣ��Ӷ���ɱ���
	public static LazySingleton getInstance2(){
		if(m_instance == null){
			synchronized (LazySingleton.class) {
				if(m_instance == null){
					m_instance = new LazySingleton();
				}
			}
			
		}
		return m_instance;
	}

}
