package com.jiangjg.lib.ThingkingInJava.Th19;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DirFindSize {
	private static Map<String, Long> maps = new HashMap<String, Long>();
	private static Map<String, Long> mapss;
	public static void main(String[] args) {
		recurseDirs(new File("C:"));
		mapss = sortMap(maps);
		int i=0;
		for (Map.Entry<String, Long> entry : mapss.entrySet()) {  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		    if(++i > 10){
		    	break;
		    }
		} 
		System.out.println(maps.size());
	}
	private static Map<String, Long> sortMap(Map<String, Long> maps){
		Map<String, Long> sortedMap = new LinkedHashMap<String, Long>(); 
		List<Map.Entry<String,Long>> list = new ArrayList<Map.Entry<String,Long>>(maps.entrySet());
		//¿ªÊ¼ÅÅÐò
		Collections.sort(list, new Comparator<Map.Entry<String, Long>>(){
			public int compare(Entry<String, Long> entry1,  
                    Entry<String, Long> entry2) {  
                long value1 = entry1.getValue(), value2 = entry2.getValue();  
                try {  
                     
                } catch (NumberFormatException e) {  
                    value1 = 0;  
                    value2 = 0;  
                }  
                return (int)(value2 - value1);  
            }  
		});
		Iterator<Map.Entry<String, Long>> iter = list.iterator();  
        Map.Entry<String, Long> tmpEntry = null;  
        while (iter.hasNext()) {  
            tmpEntry = iter.next();  
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());  
        }  
        return sortedMap;
	}
	
	private static void recurseDirs (File startDir){
		if(startDir == null || startDir.listFiles() == null || startDir.listFiles().length < 1){
			return;
		}
		for(File item : startDir.listFiles()){
			if(item.isDirectory()){
				recurseDirs(item);
			}else {
				if(item != null){
					maps.put(item.getAbsolutePath(), item.length()/1000000);
				}
				
			}
		}
	}

}
