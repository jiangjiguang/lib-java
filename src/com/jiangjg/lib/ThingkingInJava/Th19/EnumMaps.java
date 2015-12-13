package com.jiangjg.lib.ThingkingInJava.Th19;

import java.util.EnumMap;
import java.util.Map;

import static com.jiangjg.lib.ThingkingInJava.Th19.AlarmPoints.*;
interface Command{void action();}

public class EnumMaps {
	
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints,Command>(AlarmPoints.class);
		em.put(OFFICE2, new Command() {
			
			@Override
			public void action() {
				System.out.println("OFFICE2 file");
			}
		});
		for(Map.Entry<AlarmPoints, Command> e: em.entrySet()){
			System.out.println(e.getKey());
			e.getValue().action();
		}

	}

}
