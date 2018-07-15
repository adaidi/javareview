package com.canway.gz.oop.encapsulation;

import org.springframework.stereotype.Component;

@Component
public class Truck extends Car {
	
	@Override
	public void forward() {
		// TODO Auto-generated method stub
//		super.forward();
		System.out.println("i am truck , i am forwarding");
	}
}
