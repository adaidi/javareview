package com.canway.thread;

public class ThreadTest {
	
	
	private  final static String RED = null;

	
	
	
	
	
	public static void main(String[] args) {
		
//		Object b = new Object();
//		synchronized (b) {
//			
//		}
//		ResultCoe result = ResultCoe.RED;
//		
//		result.getCode();
//		result.getName();
		
		Thread t1 =  new Thread1();
		Thread t2 = new Thread(new Thread2());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t1.start();
	}
}
