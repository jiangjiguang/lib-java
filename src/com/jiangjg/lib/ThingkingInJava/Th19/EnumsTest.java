package com.jiangjg.lib.ThingkingInJava.Th19;


enum Activity{SI,LY,ST}

public class EnumsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<20; i++){
			System.out.println(Enums.random(Activity.class) + " ");
		}

	}

}
