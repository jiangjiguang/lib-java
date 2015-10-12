package com.jiangjg.lib.EffectiveJava.Th13;

import java.io.PrintStream;

public class SimpleFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		System.out.println(x);
		System.out.format("%d %f", x, y);
		System.out.printf("%d %f", x, y);
		PrintStream outa = System.out;
	}

}
