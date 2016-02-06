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
	 * 确保TimerTask访问的对象本身是线程安全的，从而就能把线程安全性封装在共享对象内部
	 * 其实有三种方法修复这个问题：
	 * 1.不在线程之间共享该状态变量
	 * 2.将状态变量修改为不可变的变量
	 * 3.在访问状态变量时使用同步
	 */
	
	public int getNext(){
		return updater.incrementAndGet(c);
		//return countAtomicLong.incrementAndGet();
		//return value++;
	}

}
