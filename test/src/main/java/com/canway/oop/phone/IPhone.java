package com.canway.oop.phone;

import com.canway.oop.Bluetooth;
import com.canway.oop.Phone;
import com.canway.oop.Wifi;

public class IPhone extends Phone implements Bluetooth , Wifi  {

	@Override
	public void wifiPro() {
		System.out.println("这里是iphon的wifi");
	}

	@Override
	public void Bluetooth() {
		System.out.println("这里是iphon的蓝牙");
		
	}

	@Override
	public void timer() {
		System.out.println("这里是iphon的定时器");
	}

}
