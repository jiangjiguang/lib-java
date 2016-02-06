package com.jiangjg.lib.JavaAndPattern.TH15;
/*
 * 子类需要父类的帮助才可以实例化
 */
public class RegSingletonChild extends RegSingleton{

	public RegSingletonChild(){}
	
	static public RegSingletonChild getInstance(){
		return (RegSingletonChild) RegSingleton.getInstance("com.jiangjg.lib.JavaAndPattern.TH15.RegSingletonChild");
	}

}
