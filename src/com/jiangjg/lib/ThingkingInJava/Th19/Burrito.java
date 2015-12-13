package com.jiangjg.lib.ThingkingInJava.Th19;

public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree){
		this.degree = degree;
	}
	public String toString()
	{
		return "Burrito: "+degree;
	}
	public static void main(String[] args) {
		System.out.println(new Burrito(Spiciness.NOT));

	}

}
