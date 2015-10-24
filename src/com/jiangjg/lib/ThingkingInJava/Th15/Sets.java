package com.jiangjg.lib.ThingkingInJava.Th15;

import java.util.HashSet;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

public class Sets {

	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	public static <T> Set<T> Intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
