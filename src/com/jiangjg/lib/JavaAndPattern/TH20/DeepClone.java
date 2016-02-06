package com.jiangjg.lib.JavaAndPattern.TH20;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepClone implements Serializable{

	/**
	 * 利用串行化来做深复制
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return oi.readObject();
	}
	
	public static void main(String[] args) throws Exception{
		DeepClone dClone = new DeepClone();
		System.out.println(dClone.deepClone());

	}

}
