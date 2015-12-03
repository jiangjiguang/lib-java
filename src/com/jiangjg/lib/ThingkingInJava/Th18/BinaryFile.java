package com.jiangjg.lib.ThingkingInJava.Th18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BinaryFile {
	public static byte[] read(File file){
		byte[] data = null;
		try {
			BufferedInputStream bf = new BufferedInputStream(new FileInputStream(file));
			try{
				data = new byte[bf.available()];
				bf.read(data);
				
			}finally{
				bf.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	public static byte[] read(String fileString){
		return read(new File(fileString).getAbsoluteFile());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
