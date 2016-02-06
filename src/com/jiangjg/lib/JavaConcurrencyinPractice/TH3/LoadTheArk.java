package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 栈封闭
 * 是线程封闭的一种特例，在栈封闭中，只能通过局部变量才能访问对象
 * ThreadLocal类
 * 这个类能使线程中的某个值与保存值的对象关联起来
 * 1.用于防止对可变的但实例变量或全局变量进行共享
 * 2.
 */
//基本类型的局部变量与引用变量的线程封闭性
public class LoadTheArk {

	public int loadTheArk(Collection<Animal> cans){
		SortedSet<Animal> animals;
		int numPairs = 0;
		Animal can = null;
		//animals被封闭在方法中，不要使它们逸出
		animals = new TreeSet<Animal>(
				//new SpeciesGenderComparator
				);
		animals.addAll(cans);
		for(Animal a : animals){
			if(can == null){
				can = a;
			}
			else {
				//ark.load;
				++numPairs;
				can=null;
			}
		}
		return numPairs;
	}

}

class Animal{
	
}
