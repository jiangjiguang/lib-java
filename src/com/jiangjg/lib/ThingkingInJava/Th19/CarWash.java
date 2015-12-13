package com.jiangjg.lib.ThingkingInJava.Th19;

import java.util.EnumSet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CarWash {

	public enum Cycle{
		UNDERBODY {
			void action(){
				System.out.println("UNDERBODY");
			}
		},
		WHEELWASH {
			void action(){
				System.out.println("WHEELWASH");
			}
		};
		abstract void action();
	}
	EnumSet<Cycle> cycles = EnumSet.of(Cycle.WHEELWASH);
	public void add(Cycle cycle){
		cycles.add(cycle);
	}
	public void washCar(){
		for(Cycle c:cycles){
			c.action();
		}
	}
	public String toString(){
		return cycles.toString();
	}
	public static void main(String[] args) {
		CarWash wash = new CarWash();
		System.out.println(wash);
		wash.washCar();
		wash.add(Cycle.UNDERBODY);
		wash.add(Cycle.UNDERBODY);
		wash.washCar();
	}

}
