package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

//线程安全的
public class Point {

	public final int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
