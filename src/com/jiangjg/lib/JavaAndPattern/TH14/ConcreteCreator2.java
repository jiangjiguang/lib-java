package com.jiangjg.lib.JavaAndPattern.TH14;

public class ConcreteCreator2 implements Creator{

	@Override
	public ProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public ProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
