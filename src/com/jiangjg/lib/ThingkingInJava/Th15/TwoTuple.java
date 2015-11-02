package com.jiangjg.lib.ThingkingInJava.Th15;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b){
		first = a;
		second = b;
	}
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
