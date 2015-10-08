package com.jiangjg.lib.EffectiveJava;

public class DoThis {
	
	void f(){
		System.out.println("ff");
	}
	public class Inner{
		public DoThis outer(){
			return DoThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoThis dt2 = new DoThis();
		DoThis dt = new DoThis();
		DoThis.Inner dti = dt.new Inner();
		dti.outer().f();
		System.out.println(dti.outer() == dt);
	}

}
