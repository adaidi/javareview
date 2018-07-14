package com.canway.oop.service.impl;

import com.canway.oop.service.CardService;

public class Mobile implements CardService {

	@Override
	public void sendMessage() {
		System.out.println("正在使用中国移动发短信");
	}

	@Override
	public void sendPhone() {
		System.out.println("正在使用中国移动打电话");
	}

}
