package com.jiangjg.lib.ThingkingInJava.Th19;
import static com.jiangjg.lib.ThingkingInJava.Th19.Outcome.*;

import java.util.Random;



interface Item{
	Outcome compete(Item it);
	Outcome eval(Paper p);
	Outcome eval(Scissors s);
	Outcome eval(Rock r);
}
class Paper implements Item{

	@Override
	public Outcome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public Outcome eval(Paper p) {
		// TODO Auto-generated method stub
		return DRAN;
	}

	@Override
	public Outcome eval(Scissors s) {
		// TODO Auto-generated method stub
		return WIN;
	}

	@Override
	public Outcome eval(Rock r) {
		// TODO Auto-generated method stub
		return LOSE;
	}
	public String toString(){
		return "Paper";
	}
}
class Scissors implements Item{

	@Override
	public Outcome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public Outcome eval(Paper p) {
		// TODO Auto-generated method stub
		return DRAN;
	}

	@Override
	public Outcome eval(Scissors s) {
		// TODO Auto-generated method stub
		return WIN;
	}

	@Override
	public Outcome eval(Rock r) {
		// TODO Auto-generated method stub
		return LOSE;
	}
	public String toString(){
		return "Scissors";
	}
}
class Rock implements Item{

	@Override
	public Outcome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public Outcome eval(Paper p) {
		// TODO Auto-generated method stub
		return DRAN;
	}

	@Override
	public Outcome eval(Scissors s) {
		// TODO Auto-generated method stub
		return WIN;
	}

	@Override
	public Outcome eval(Rock r) {
		// TODO Auto-generated method stub
		return LOSE;
	}
	public String toString(){
		return "Rock";
	}
}

public class roShamBo1 {
	static final int SIZE = 20;
	private static Random random = new Random(47);
	public static Item newItem(){
		switch(random.nextInt(3)){
			default:
			case 0 : return new Scissors();
			case 1 : return new Paper();
			case 2 : return new Rock();
		}
	}
	public static void match(Item a, Item b){
		System.out.println(a + "vs. " + b + ": " + a.compete(b));
	}
	public static void main(String[] args) {
		for(int i=0; i<1; i++){
			match(newItem(), newItem());
		}
		

	}

}
