package com.jiangjg.lib.EffectiveJava;

import java.util.LinkedList;

public class Stack<E> {

	
	private LinkedList<E> storage = new LinkedList<E>();
	
	public void push(E v){
		storage.addFirst(v);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		

	}

}
