package com.jiangjg.lib.ThingkingInJava.Th15;

import java.awt.Robot;
import java.lang.reflect.Method;

/**
 * 对缺乏潜在类型的补偿
 */

class Mine{
	public void walkAgainstTheWind(){}
	public void spit(){
		System.out.println("Pretending to sit");
	}
	public void pushInvisibleWills(){}
	public String toString(){
		return "Mine";
	}
}
class SmartDog{
	public void speak(){
		System.out.println("Woof");
	}
	public void sit(){
		System.out.println("Sitting");
	}
	public void reproducce(){
		
	}
}
class CommunicateReflectively{
	public static void perform(Object speaker){
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker + " cannot speak");
			}
			try {
				Method speak = spkr.getMethod("sit");
				speak.invoke(speaker);
			} catch (Exception e) {
				System.out.println(speaker + " cannot sit");
			}
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}

public class LatentReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Mine());
		//CommunicateReflectively.perform(new Robot());
	}

}
