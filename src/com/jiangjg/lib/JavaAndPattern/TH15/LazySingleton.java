package com.jiangjg.lib.JavaAndPattern.TH15;

/*
 * 懒汉式单例类
 * 
 */
public class LazySingleton {

	private static LazySingleton m_instance = null;
	private LazySingleton(){
		
	}
	//这个方法是成立
	synchronized public static LazySingleton getInstance(){
		if(m_instance == null){
			m_instance = new LazySingleton();
		}
		return m_instance;
	}
	
	//这个方法是不成立的
	//因为在Java的编译器中类的初始化和变量的赋值的顺序不可预料。如果一个线程在没有同步化的条件下读取m_instance引用
	//并且调用这个对象的方法的话，可能会发现对象的初始化过程尚未完成，从而造成崩溃
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
