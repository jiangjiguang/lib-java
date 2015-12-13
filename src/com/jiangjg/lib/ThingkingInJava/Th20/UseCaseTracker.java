package com.jiangjg.lib.ThingkingInJava.Th20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	
	public static void trackUseCase(List<Integer> useCases, Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null){
				System.out.println("found: " + uc.id() + " " + uc.decription());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for(int i : useCases){
			System.out.println("missing: " + i);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);
		trackUseCase(useCases, PasswordUtils.class);
	}

}
