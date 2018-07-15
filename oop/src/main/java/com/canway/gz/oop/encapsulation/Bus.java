package com.canway.gz.oop.encapsulation;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Car{

	private int maxNum;
	
	@Override
	public void forward() {

		System.out.println("i am bus , i am forwarding");
	}
	
	public int getMaxNum() {
		return maxNum;
	}


	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	
}
