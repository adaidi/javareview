package com.canway.oop.phone;

import com.canway.oop.Bluetooth;
import com.canway.oop.Phone;

public class Moto  extends Phone implements Bluetooth{

	@Override
	public void Bluetooth() {
		System.out.println("这里是moto的蓝牙");
		
	}

	@Override
	public void timer() {
		System.out.println("这里是moto的定时器");		
	}

}
