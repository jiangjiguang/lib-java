package com.jiangjg.lib.ThingkingInJava.Th15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

class MinxinProxy implements InvocationHandler{
	Map<String,Object> deledatesByMethod;
	public MinxinProxy(TwoTuple<Object,Class<?>>... pairs){
		deledatesByMethod = new HashMap<String, Object>();
		for(TwoTuple<Object, Class<?>> pair : pairs){
			for(Method method : pair.second.getMethods()){
				String methodName = method.getName();
				if(!deledatesByMethod.containsKey(methodName)){
					deledatesByMethod.put(methodName, pair.first);
				}
			}
		}
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		Object delegate = deledatesByMethod.get(methodName);
		return method.invoke(delegate, args);
	}
	public static Object newInstance(TwoTuple... pairs){
		Class[] interfaces = new Class[pairs.length];
		for(int i=0; i<pairs.length; i++){
			interfaces[i] = (Class)pairs[i].second;
		}
		ClassLoader cl = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(cl, interfaces, new MinxinProxy(pairs));
	}
}

public class DynamicProxyMixin {
	public static void main(String[] args) {
		//Object mixin = MinxinProxy.newInstance(tuple(new Object(), Object.class),tuple(new Object(), Object.class));

	}

}
