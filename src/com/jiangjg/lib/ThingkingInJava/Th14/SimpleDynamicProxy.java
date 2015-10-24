package com.jiangjg.lib.ThingkingInJava.Th14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("---- proxy: " + proxy.getClass() + 
				", method: " + method + ", args: " + args);
		if(args != null){
			for (Object arg: args) {
				System.out.println(arg);
			}
			
		}
		return method.invoke(proxied, args);
		
	}
	
}

class SimpleDynamicProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
