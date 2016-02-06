package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.util.HashSet;
import java.util.Set;
/*
 * 实例封闭是构件线程安全类的一个最简单方式
 */
//通过封闭机制来确保线程安全
public class PersonSet {
	private final Set<Person> mySet = new HashSet<Person>();
	public synchronized void addPerson(Person p){
		mySet.add(p);
	}
	public synchronized boolean containPerson(Person p){
		return mySet.contains(p);
	}

}
class Person{
	
}
