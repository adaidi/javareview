package com.canway.oop.phone;

import com.canway.oop.Phone;
import com.canway.oop.Wifi;

public class Nokia extends Phone implements Wifi {

	@Override
	public void wifiPro() {
		System.out.println("这里是nokia的wifi");
	}

	@Override
	public void timer() {
		System.out.println("这里是nokia的timer定时器");
	}
	
	
}
