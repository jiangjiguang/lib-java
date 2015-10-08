package com.jiangjg.lib.EffectiveJava;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenetics<E> {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList apples = new ArrayList();
		for(int i=0; i<3; i++){
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(int i=0; i<apples.size(); i++){
			long ii = ((Apple)apples.get(i)).id();
			System.out.println(ii);
		}
	}

}

class 	Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}
class Orange<E>{
	
}