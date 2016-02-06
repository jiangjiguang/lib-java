package com.jiangjg.lib.JavaAndPattern.TH14;

public class ConcreteCreator1 implements Creator{

	@Override
	public ProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public ProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
