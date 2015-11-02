package com.jiangjg.lib.ThingkingInJava.Th15;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit {}
class Orange extends Fruit {}

public class GenericsAndCovariance {

	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Fruit>();
		//flist.add(new Fruit());
		//flist.add(new Apple());

	}

}
