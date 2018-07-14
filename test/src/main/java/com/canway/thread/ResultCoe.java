package com.canway.thread;

public enum ResultCoe {
	RED("500","异常"),GREE("200","ok");
	
	private ResultCoe(String code ,String name) {
		this.name = name;
		this.code = code;
	}
	
	private String name;
	
	
	private String code;


	public String getName() {
		return name;
	}


	public String getCode() {
		return code;
	}
	
	
	
	
}
