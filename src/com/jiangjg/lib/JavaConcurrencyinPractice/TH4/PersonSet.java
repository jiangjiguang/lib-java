package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.util.HashSet;
import java.util.Set;
/*
 * ʵ������ǹ����̰߳�ȫ���һ����򵥷�ʽ
 */
//ͨ����ջ�����ȷ���̰߳�ȫ
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
