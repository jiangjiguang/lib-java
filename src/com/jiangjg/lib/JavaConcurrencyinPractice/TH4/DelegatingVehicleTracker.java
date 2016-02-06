package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

//���̰߳�ȫί�и�ConcurrentHashMap
public class DelegatingVehicleTracker {

	private final ConcurrentMap<String, Point> locations;
	private final Map<String, Point> unmodifiableMap;
	public DelegatingVehicleTracker(Map<String, Point> points){
		locations = new ConcurrentHashMap<String, Point>(points);
		//unmodifiableMap = Collections.unmodifiableMap(locations);  //���صĶ�����ͬ���仯��
		unmodifiableMap = Collections.unmodifiableMap(new HashMap<String, Point>(locations));  //���صĶ���ֻ��һ�����գ���ͬ���仯
	}
	public Map<String, Point> getLocations(){
		return unmodifiableMap;
	}
	public Point getLocation(String id){
		return locations.get(id);
	}
	public void setLocation(String id, int x, int y){
		if(locations.replace(id, new Point(x, y)) == null){
			//�׳��쳣
		}
	}
}
