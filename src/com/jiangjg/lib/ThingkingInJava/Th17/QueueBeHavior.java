package com.jiangjg.lib.ThingkingInJava.Th17;

import java.util.Queue;

import com.jiangjg.lib.ThingkingInJava.Th15.Generator;

public class QueueBeHavior {
	
	private static int count = 10;
	static <T> void test (Queue<T> queue, Generator<T> gen){
		for(int i=0; i<count ; i++){
			queue.offer(gen.next());
		}
		while(queue.peek() != null){
			System.out.println(queue.remove() + " ");
		}
		System.out.println();
	}
	static class Gen implements Generator<String>{
		String[] s = ("o t t f f s s e n t").split(" ");
		int i;
		public String next(){
			return s[i++];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
