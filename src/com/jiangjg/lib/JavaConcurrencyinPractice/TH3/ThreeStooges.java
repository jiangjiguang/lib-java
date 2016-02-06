package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.util.HashSet;
import java.util.Set;

/*
 * 除非需要某个域是可变的，否则应将其声明为final域 是一个良好的编程习惯
 * 
 * 在并发程序中使用和共享对象时，可以使用一些实用的策略：
 * 1.线程封闭
 * 线程封闭的对象只能由一个线程拥有，对象被封闭在该线程中，并且只能由这个线程修改
 * 2.只读共享
 * 在没有额外同步的情况下，共享的只读对象可以由多个线程并发访问，但任何线程都不能修改它。
 * 共享的只读对象包括不可变对象和事实不可变对象
 * 3.线程安全共享
 * 线程安全的对象在其内部实现同步，因此多个线程可以通过对象的共有接口来进行访问而不需要进一步的同步
 * 4.保护对象
 * 被保护的对象只能通过持有特定的锁来访问。保护对象包括封装在其他线程安全对象中的对象，以及已发布的并且由某个特定锁保护的对象
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
