package com.jiangjg.lib.JavaAndPattern.TH15;

/*
 * 饿汉式单例
 * 类加载时静态变量会被初始化，类的构造子是私有的，因此此类不能被继承
 */
public class EagerSingleton {
	
	private static final EagerSingleton m_instance = new EagerSingleton();
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return m_instance;
	}
}

