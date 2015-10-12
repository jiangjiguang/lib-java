package com.jiangjg.lib.EffectiveJava;


class VeryImportantException extends Exception{
	public String toString(){
		return "A very important Exception";
	}
}

class HoHumException extends Exception{
	public String toString(){
		return "A trivial Exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				//lm.dispose();
				return;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
