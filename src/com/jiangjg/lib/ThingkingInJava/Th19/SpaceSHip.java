package com.jiangjg.lib.ThingkingInJava.Th19;

public enum SpaceSHip {
	SCOUT,CARGO;
	public String toString(){
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}
	public static void main(String[] args){
		for(SpaceSHip sHip : values()){
			System.out.println(sHip);
		}
	}
}
