package com.jiangjg.lib.EffectiveJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class AddingGroups {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(16,17);
		list.set(1, 99);
		System.out.println(list.toString());
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(16,17));
		
		Iterator<Integer> iterator = list2.iterator();
		
		ListIterator<Integer> ll = list2.listIterator();
		
		LinkedList<String> llLinkedList = new LinkedList<String>(); 
		
		while(iterator.hasNext()){
			Integer string = iterator.next();
			System.out.println(string);
		}
		//list.add(21);
		for (Integer integer : list) {
			//System.out.println(integer);
		}
		
		Map<String, String> map = new HashMap<>(); 
	}

}
