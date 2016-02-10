package com.jiangjg.lib.ThingkingInJava.Th21;

import java.io.IOException;

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI(){
		while(d>0){
			d = d + (Math.PI + Math.E) /d;
		}
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ResponsiveUI extends Thread{
	private volatile static double d = 1;
	public ResponsiveUI(){
		setDaemon(true);
		start();
	}
	public void run(){
		while(true){
			d = d + (Math.PI + Math.E) / d;
			//System.out.println("111");
		}
	}
	public static void main(String[] args) throws Exception {
		//new ResponsiveUI();
		new UnresponsiveUI();
		System.in.read();
		System.out.println(d);
	}

}
