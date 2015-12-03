package com.jiangjg.lib.ThingkingInJava.Th18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {

	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		FileChannel 
			in = new FileInputStream(args[0]).getChannel(),
			out = new FileOutputStream(args[1]).getChannel();
//		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
//		while(in.read(buffer) != -1){
//			buffer.flip();
//			out.write(buffer);
//			buffer.clear();
//		}
		in.transferTo(0, in.size(), out);
		

	}

}
