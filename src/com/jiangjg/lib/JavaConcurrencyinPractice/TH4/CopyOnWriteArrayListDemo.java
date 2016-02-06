package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CopyOnWriteArrayList�ʺ�ʹ���ڶ�����ԶԶ����д�����ĳ�������绺�档�����޸�ʱ����copy�����ϰ汾���룬��֤���ĸ����ܣ��������Զ�Ϊ���������
 */
public class CopyOnWriteArrayListDemo {

	/**
     * ���߳�
     * @author jiangjg
     *
     */
    private static class ReadTask implements Runnable {
        List<String> list;
 
        public ReadTask(List<String> list) {
            this.list = list;
        }
 
        public void run() {
            for (String str : list) {
                System.out.println(str);
            }
        }
    }
    /**
     * д�߳�
     * @author jiangjg
     *
     */
    private static class WriteTask implements Runnable {
        List<String> list;
        int index;
 
        public WriteTask(List<String> list, int index) {
            this.list = list;
            this.index = index;
        }
 
        public void run() {
            list.remove(index);
            list.add(index, "write_" + index);
        }
    }
 
    public void run() {
        final int NUM = 10;
        //List<String> list = new ArrayList<String>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < NUM; i++) {
            list.add("main_" + i);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(NUM);
        for (int i = 0; i < 1; i++) {
            executorService.execute(new ReadTask(list));
            executorService.execute(new WriteTask(list, i));
        }
        executorService.shutdown();
    }
 
    public static void main(String[] args) {
        new CopyOnWriteArrayListDemo().run();
    }

}
