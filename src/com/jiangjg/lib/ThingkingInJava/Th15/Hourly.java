package com.jiangjg.lib.ThingkingInJava.Th15;


interface Payable<T>{}

class Employee implements Payable<Employee>{}


public class Hourly extends Employee implements Payable<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
