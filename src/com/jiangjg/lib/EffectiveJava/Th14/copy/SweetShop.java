package com.jiangjg.lib.EffectiveJava.Th14.copy;


class Candy{
	static final int aa = 22;
	static {
		System.out.println("loading candy");
	}
}

class Gum extends Candy{
	static{
		System.out.println("Gum");
	}
}

public class SweetShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Candy();
		Class<Gum> class1 = null;
		class1 = Gum.class;
		//class1 = int.class;
		Class<? extends Candy> object = class1;
		try {
			Candy gum = object.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
