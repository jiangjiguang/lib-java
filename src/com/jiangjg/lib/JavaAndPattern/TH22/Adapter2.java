package com.jiangjg.lib.JavaAndPattern.TH22;

public class Adapter2 implements Target{
	
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void sampleOperation1() {
		adaptee.sampleOperation1();
		
	}

	@Override
	public void sampleOperation2() {
		//your code
		
	}

	

}
