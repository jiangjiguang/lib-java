package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

/*
 * Java的监视器模式会把对象的所有可变状态都封装起来，并由对象自己的内置锁来保护
 */
public class PrivateLock {
	private final Object myLock = new Object();
	Integer integer = new Integer(0);
	void someMethod(){
		synchronized (myLock) {
			//访问或修改integer的状态
		}
	}

}
