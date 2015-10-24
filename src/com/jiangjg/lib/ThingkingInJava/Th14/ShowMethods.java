package com.jiangjg.lib.ThingkingInJava.Th14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowMethods {

	private static String usage = 
			"usage:\n" +
			"ShowMethods qua";
	private static Pattern p = Pattern.compile("\\w+\\."); 
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			c.getClassLoader();
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1){
				/*for (Method method : methods) {
					System.out.println(method.toString());
				}
				System.out.println("-----------------------------------------");*/
				for (Method method : methods) {
					//System.out.println(method.getExceptionTypes());
					//System.out.println(p.matcher(method.toString()).replaceAll(""));
					Matcher matcher = p.matcher(method.toString());
					while(matcher.find()){
						System.out.println(matcher.group());
					}
					System.out.println("------------------------");
				}
			}
			else{
				for (Method method : methods) {
					if(method.toString().indexOf(args[1]) != -1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
