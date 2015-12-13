package com.jiangjg.lib.ThingkingInJava.Th19;


public class TrafficLight {
	Signal color = Signal.RED;
	public void change(){
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLO;
			break;
		case YELLO:
			color = Signal.RED;
			break;
		}
	}
	public String toString(){
		return "the : "+color;
	}
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
		for(int i=0; i<7; i++){
			System.out.println(t);
			t.change();
		}

	}

}
