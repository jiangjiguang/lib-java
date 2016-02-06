package com.jiangjg.lib.JavaAndPattern.TH15;

import java.util.HashMap;
/*
 * 登记式单例类
 */
public class RegSingleton {

	static private HashMap m_registry = new HashMap();
	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}
	protected RegSingleton(){
		
	}
	static public RegSingleton getInstance(String name){
		if(name == null){
			name = "com.jiangjg.lib.JavaAndPattern.TH15.RegSingleton";
		}
		if(m_registry.get(name) == null){
			try {
				m_registry.put(name, Class.forName(name).newInstance());
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
		return (RegSingleton) m_registry.get(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
