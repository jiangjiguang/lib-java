package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.awt.Event;
import java.beans.EventSetDescriptor;
import java.util.EventListener;
/*
 * �ڹ��������ʹthis�ݳ������⣺
 * 1.�ڹ��캯��������һ���̣߳�this���ö��ᱻ�´������̹߳����ڹ��캯���д����̲߳�û�д��󣬵���ò�Ҫ����������������ͨ��һ����������
 * 2.�ڹ��캯���е���һ���ɸ�д��ʵ������ʱ��Ҳ�ᵼ��this�����ڹ���������ݳ�
 * 3.���Խ�this���ñ��浽ĳ���ط���ֻҪ�����̲߳����ڹ��캯�����֮ǰʹ����
 */
/*
 * �̷߳�գ����ڵ��߳��ڷ�������
 * 
 */
public class SafeListener {
	private final EventListener listener;
	private SafeListener(){
		listener = new EventListener() {
			public void onEvent(Event e){
				//dosomething(e);
			}
		};
	}
	public static SafeListener newInstance(Event event){
		SafeListener safeListener = new SafeListener();
		//event.registerListener(safeListener.listener);
		return safeListener;
	}

}
