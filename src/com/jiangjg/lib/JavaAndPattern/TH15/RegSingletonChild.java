package com.jiangjg.lib.JavaAndPattern.TH15;
/*
 * ������Ҫ����İ����ſ���ʵ����
 */
public class RegSingletonChild extends RegSingleton{

	public RegSingletonChild(){}
	
	static public RegSingletonChild getInstance(){
		return (RegSingletonChild) RegSingleton.getInstance("com.jiangjg.lib.JavaAndPattern.TH15.RegSingletonChild");
	}

}
