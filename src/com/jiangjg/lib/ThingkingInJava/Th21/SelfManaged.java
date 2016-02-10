package com.jiangjg.lib.ThingkingInJava.Th21;

public class SelfManaged implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			new SelfManaged();
		}

	}
	private int countDown = 5;
	private Thread thread = new Thread(this);
	public SelfManaged(){
		thread.start();
	}
	public String toString(){
		return Thread.currentThread().getName() + " " + countDown ;
	}
	@Override
	public void run() {
		while(true){
			System.out.println(this);
			if(--countDown == 0){
				return;
			}
			//Thread.yield();
		}
		
	}

}
