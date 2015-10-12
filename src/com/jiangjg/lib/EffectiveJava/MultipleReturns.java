package com.jiangjg.lib.EffectiveJava;

public class MultipleReturns {

	public static boolean f(int i){
		System.out.println("init");
		try{
			System.out.println("try");
			return true;
		}finally{
			System.out.println("finally");
			return false;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = f(0);
		System.out.println(b);
	}

}
