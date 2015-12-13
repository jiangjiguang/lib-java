package com.jiangjg.lib.ThingkingInJava.Th19;

enum Search{HITHER,YON}

public class UpcastEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Search[] vals = Search.values();
		Enum<?> e = Search.HITHER;
		for(Enum en: e.getClass().getEnumConstants()){
			System.out.println(en);
		}

	}

}
