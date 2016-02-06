package com.jiangjg.lib.JavaAndPattern.TH17;

public class Die {

	private static Die die1 = new Die();
	private static Die die2 = new Die();
	private Die(){}
	public static Die getInstance(int whichOne){
		if(whichOne == 1){
			return die1;
		}
		else {
			return die2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
