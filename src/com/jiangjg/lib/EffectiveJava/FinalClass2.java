package com.jiangjg.lib.EffectiveJava;

import java.util.ArrayList;

public class FinalClass2 extends FinalClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalClass2 fClass2 = new FinalClass2();
		FinalClass fc = fClass2;
		fClass2.f();
		fClass2.g();

	}
	public void g(){
		f();
	}
	public void f() throws NullPointerException{
		super.f();
		System.out.println("FinalClass2 f");
		throw new NullPointerException();
	}

}
