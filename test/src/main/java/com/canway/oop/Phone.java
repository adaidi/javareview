package com.canway.oop;

import com.canway.oop.service.CardService;
import com.canway.oop.service.impl.Mobile;

public abstract class Phone {
	
	public  static String names = "test";
	
	private CardService[] cardService ;
	

	public CardService[] getCardService() {
		return cardService;
	}

	public void setCardService(CardService[] cardService) {
		this.cardService = cardService;
	}

	public void start() {
		System.out.println("正在开机.........");
	}
	
	public void close() {
		System.out.println("正在关机中.........");
	}
	
	public abstract void timer();
	
	
}
