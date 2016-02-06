package com.jiangjg.lib.JavaConcurrencyinPractice.TH2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * ����1��������Ŀ�겻����static���ͣ�ǰ��˵��unsafe���Ѿ����Բ²⵽����ȡ���Ƿ�static���͵�����ƫ�����������static�����ڻ�ȡʱ���û��ʹ�ö�Ӧ�ķ����ǻᱨ��ģ������Updater��û��ʹ�ö�Ӧ�ķ�����

����2��������Ŀ�겻����final���͵ģ���Ϊfinal����û���޸ġ�

����3��������volatile���͵����ݣ�Ҳ�������ݱ����Ƕ�һ�µġ�

����4�����Ա���Ե�ǰ��Updater���ڵ������ǿɼ��ģ�Ҳ����private������ǵ�ǰ��϶��ǲ��ɼ��ģ�protected��������ڸ��ӹ�ϵҲ�ǲ��ɼ��ģ�default���������ͬһ��package��Ҳ�ǲ��ɼ���
 */
public class AtomicIntegerFieldUpdaterTest {

	static class A {  
        volatile int intValue = 100;  
    }  
      
    /** 
     * ����ֱ�ӷ��ʶ�Ӧ�ı����������޸ĺʹ��� 
     * ������Ҫ�ڿɷ��ʵ������ڣ������private��������default�����Լ��Ǹ������protected���޷����ʵ� 
     * ��η��ʶ�������static���͵ı�������Ϊ�ڼ������Ե�ƫ������ʱ���޷����㣩��Ҳ������final���͵ı�������Ϊ�����޷��޸ģ�����������ͨ�ĳ�Ա���� 
     *  
     * ������˵���Ϻ�AtomicInteger����һ�£�Ψһ�������ǵ�һ��������Ҫ�����������ã� 
     * @see AtomicIntegerFieldUpdater#addAndGet(Object, int) 
     * @see AtomicIntegerFieldUpdater#compareAndSet(Object, int, int) 
     * @see AtomicIntegerFieldUpdater#decrementAndGet(Object) 
     * @see AtomicIntegerFieldUpdater#incrementAndGet(Object) 
     *  
     * @see AtomicIntegerFieldUpdater#getAndAdd(Object, int) 
     * @see AtomicIntegerFieldUpdater#getAndDecrement(Object) 
     * @see AtomicIntegerFieldUpdater#getAndIncrement(Object) 
     * @see AtomicIntegerFieldUpdater#getAndSet(Object, int) 
     */  
    public final static AtomicIntegerFieldUpdater <A> ATOMIC_INTEGER_UPDATER = AtomicIntegerFieldUpdater.newUpdater(A.class, "intValue");  
      
    public static void main(String []args) {  
        final A a = new A();  
        for(int i = 0 ; i < 100 ; i++) {  
            final int num = i;  
            new Thread() {  
                public void run() {  
                    if(ATOMIC_INTEGER_UPDATER.compareAndSet(a, 100, 120)) {  
                        System.out.println("�����̣߳�" + num + " �ҶԶ�Ӧ��ֵ�����޸ģ�");  
                        System.out.println(a.intValue);
                    }  
                    
                }  
            }.start();  
        }  
    }  

}
