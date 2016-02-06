package com.jiangjg.lib.JavaAndPattern.TH13;

public class Client {
	private static Creator  creator1, creator2;
	public static void main(String[] args) {
		creator1 = new ConcreteCreator1();
		creator2 = new ConcreteCreator2();
		Product product = creator1.factory();
		Product product2 = creator2.factory();
		

	}

}
