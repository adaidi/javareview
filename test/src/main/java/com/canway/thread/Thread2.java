package com.canway.thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		String  name = Thread.currentThread().getName();
		for(int i = 1; i < 11; i++) {
			System.out.println(name+":"+i);
		}
	}

}
