package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.util.HashMap;
import java.util.Map;

public class DelegatingVehicleTrackerTest {

	
	public static void main(String[] args) {
		Point point = new Point(1, 1);
		Map<String, Point> map = new HashMap<String, Point>();
		map.put("a", point);
		DelegatingVehicleTracker dv = new DelegatingVehicleTracker(map);
		
		Thread thread1 = new Thread(new DelegatingVehicleTrackerWrite(dv));
		Thread thread2 = new Thread(new DelegatingVehicleTrackerRead(dv));
		thread1.start();
		thread2.start();
	}

}

class DelegatingVehicleTrackerWrite implements Runnable{
	DelegatingVehicleTracker dv = null;
	public DelegatingVehicleTrackerWrite(DelegatingVehicleTracker dv){
		this.dv = dv;
	}
	@Override
	public void run() {
		dv.setLocation("a", 1, 2);
	}
}

class DelegatingVehicleTrackerRead implements Runnable{
	DelegatingVehicleTracker dv = null;
	Map<String, Point> map = null;
	public DelegatingVehicleTrackerRead(DelegatingVehicleTracker dv){
		this.dv = dv;
	}
	@Override
	public void run() {
		for(int i=0; i<1000; i++){
			if(map == null){
				map = dv.getLocations();
			}else {
				for(String idString : map.keySet()){
					System.out.println("id: " + idString + " values: " + map.get(idString).y);
				}
			}
			
		}
		
		
	}
}