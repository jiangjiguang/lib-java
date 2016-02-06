package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;
//线程安全
/*
 * 加锁的含义不仅仅局限于互斥行为，还包括内存可见性。为了确保所有线程都能看到共享变量的最新值，
 * 所有执行读操作或者写操作的线程都必须在同一个锁上同步
 * 加锁机制既可以确保可见性又可以确保原子性，而volatile变量只能确保可见性
 * volatile变量使用的条件：
 * 1.对变量的写入操作不依赖变量的当前值，或者你能确保只有单个线程更新变量的值
 * 2.该变量不会与其他状态变量一起纳入不变形条件中
 * 3.在访问变量时不需要加锁
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
