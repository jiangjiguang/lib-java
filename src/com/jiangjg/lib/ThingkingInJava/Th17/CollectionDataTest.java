package com.jiangjg.lib.ThingkingInJava.Th17;

import java.util.LinkedHashSet;
import java.util.Set;

import com.jiangjg.lib.ThingkingInJava.Th15.Generator;

class Goverment implements Generator<String>{
	String[] foundation = ("a b c d e").split(" ");
	private int index;
	@Override
	public String next() {
		return foundation[index++];
	}
}

public class CollectionDataTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Goverment(), 5));
		set.addAll(CollectionData.list(new Goverment(), 4));
		System.out.println(set);

	}

}
