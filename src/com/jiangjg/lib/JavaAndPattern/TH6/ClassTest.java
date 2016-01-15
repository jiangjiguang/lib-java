package com.jiangjg.lib.JavaAndPattern.TH6;

public class ClassTest extends AbstractClassTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.Test();
		//AbstractClassTest abstractClassTest = new AbstractClassTest();

	}
	@Override
	public void Test(){
		super.Test();
		System.out.println("real");
	}

}
