package com.jiangjg.lib.ThingkingInJava.Th18;

import java.io.PrintWriter;

public class ChangeSystemOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		out.println("hello");
		out.close();

	}

}
