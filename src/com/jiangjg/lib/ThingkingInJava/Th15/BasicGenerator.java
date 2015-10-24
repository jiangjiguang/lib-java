package com.jiangjg.lib.ThingkingInJava.Th15;

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	public BasicGenerator(Class<T> type){
		this.type = type;
	}
	public T next(){
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<>(type);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
