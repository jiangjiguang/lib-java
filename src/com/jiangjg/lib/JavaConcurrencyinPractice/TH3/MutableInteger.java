package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

//非线程安全
public class MutableInteger {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
