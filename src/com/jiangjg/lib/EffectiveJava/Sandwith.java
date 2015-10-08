package com.jiangjg.lib.EffectiveJava;

public class Sandwith extends Meal{

	
	public Sandwith(){
		System.out.println("Sandwith");
	}
	
	//private Bread b = new Bread();
	
	//private static long counter = 0;
	//private final long id = 
			//counter++;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwith sandwith = new Sandwith();
		//Meal meal = new Meal();
	}

}
abstract class Meal{
	Meal() {
		System.out.println("Meal");
	}
}
class Bread{
	Bread() {
		System.out.println("Bread");
	}
}
