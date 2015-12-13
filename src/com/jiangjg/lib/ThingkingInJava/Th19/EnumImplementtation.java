package com.jiangjg.lib.ThingkingInJava.Th19;

import java.util.Random;

import com.jiangjg.lib.ThingkingInJava.Th15.Generator;

enum CartoonCharacter implements Generator<CartoonCharacter>{
	SLAPPY,SP,PU,SI,BO,NU,BOB;
	private Random rand = new Random(47);
	public CartoonCharacter next(){
		return values()[rand.nextInt(values().length)];
	}
}

public class EnumImplementtation {
	public static <T> void printNext(Generator<T> rg){
		System.out.println(rg.next());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CartoonCharacter cc = CartoonCharacter.BOB;
		for(int i=0; i<10; i++){
			printNext(cc);
		}

	}

}
