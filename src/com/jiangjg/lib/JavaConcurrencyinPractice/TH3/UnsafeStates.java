package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

/*
 * 发布：使对象能够在当前作用域之外的代码中使用。
 * 当某个不应该发布的对象被发布时，这种情况叫做逸出
 * 
 */
//使内部的可变状态逸出(不要这么做)
//不要在构造过程中使this引用逸出
/*
 * 
 */
public class UnsafeStates {
	private String[] states = new String[]{
		"AK","AL"	
	};
	public String[] getStates(){
		return states;
	}
}
