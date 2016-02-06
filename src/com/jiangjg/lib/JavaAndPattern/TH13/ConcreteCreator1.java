package com.jiangjg.lib.JavaAndPattern.TH13;

public class ConcreteCreator1 implements Creator{

	@Override
	public Product factory() {
		// TODO Auto-generated method stub
		return new ConcreteProduct1();
	}

}
