package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * ջ���
 * ���̷߳�յ�һ����������ջ����У�ֻ��ͨ���ֲ��������ܷ��ʶ���
 * ThreadLocal��
 * �������ʹ�߳��е�ĳ��ֵ�뱣��ֵ�Ķ����������
 * 1.���ڷ�ֹ�Կɱ�ĵ�ʵ��������ȫ�ֱ������й���
 * 2.
 */
//�������͵ľֲ����������ñ������̷߳����
public class LoadTheArk {

	public int loadTheArk(Collection<Animal> cans){
		SortedSet<Animal> animals;
		int numPairs = 0;
		Animal can = null;
		//animals������ڷ����У���Ҫʹ�����ݳ�
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
