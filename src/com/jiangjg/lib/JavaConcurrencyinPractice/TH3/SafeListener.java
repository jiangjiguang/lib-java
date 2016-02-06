package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.awt.Event;
import java.beans.EventSetDescriptor;
import java.util.EventListener;
/*
 * 在构造过程中使this逸出的问题：
 * 1.在构造函数中启动一个线程，this引用都会被新创建的线程共享。在构造函数中创建线程并没有错误，但最好不要立即启动它，而是通过一个方法启动
 * 2.在构造函数中调用一个可改写的实例方法时，也会导致this引用在构造过程中逸出
 * 3.可以将this引用保存到某个地方，只要其他线程不会在构造函数完成之前使用它
 */
/*
 * 线程封闭：仅在单线程内访问数据
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
