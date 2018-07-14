package com.canway.thread;

public class Thread1 extends Thread {

	@Override
	public void run() {
		String  name = Thread.currentThread().getName();
		for(int i = 1; i < 11; i++) {
			System.out.println(name+":"+i);
		}
	}

}
