package com.jiangjg.lib.ThingkingInJava.Th20;

import org.junit.Test;

public class AtUnitExample1 {

	public String methodOne(){
		return "one";
	}
	@Test
	boolean methodOneTest(){
		return methodOne().equals("one");
	}
	public static void main(String[] args) {
		
	}

}
