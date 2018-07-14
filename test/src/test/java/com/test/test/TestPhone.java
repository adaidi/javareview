package com.test.test;

import com.canway.oop.Phone;
import com.canway.oop.phone.IPhone;
import com.canway.oop.phone.Nokia;
import com.canway.oop.service.CardService;
import com.canway.oop.service.impl.Mobile;
import com.canway.oop.service.impl.Telecom;
import com.canway.oop.service.impl.Unicom;

public class TestPhone {
	
	
	
	public static void main(String[] args) {
		System.out.println(Phone.names);
		
		int card = 1;
		Phone phone = new Nokia();
		
		
		CardService[] cards = new CardService[3];
		cards[0] = new Telecom();
		cards[1] = new Mobile();
		cards[2] = new Unicom();
		phone.setCardService(cards);
		
		phone.start();
		phone.timer();
		//调用卡，发短信，打电话
		CardService[] services = phone.getCardService();
		CardService cardService = services[card];
		
		cardService.sendMessage();
		cardService.sendPhone();
		
		phone.close();
	}
}
