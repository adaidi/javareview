package com.test.test;

public class Book {
	
//	名称
	private String title;
	
//	页数
	private Integer pageNum;
	
//	类型
	private String type ;
	
	public Book() {
		System.out.println("这里是无参数的构造函数");
	}
	
	public Book(String title, int pageNum) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = "计算机";
		System.out.println("这里是2个参数的构造函数");
	}
	
	public Book(String title, int pageNum,String type) {
		String bookTitle = "计算机";
		
		if(type == null) {
			this.type = bookTitle;
		}else if(!bookTitle.equals(type)) {
			this.type = type;
		}else {
			this.type = bookTitle;
		}
		this.title = title;
		this.pageNum = pageNum;
		System.out.println("这里是3个参数的构造函数");
		
	}
	
	
	
	
	
	
	//详细方法
//	public void detail() {
//		System.out.println("名称："+ this.title 
//				+ ";页数："+ this.pageNum 
//				+";种类："+ this.type);
//	}
	
	
	
	
	




	@Override
	public String toString() {
		return "Book [title=" + title + ", pageNum=" + pageNum + ", type=" + type + "]";
	}










	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPageNum() {
		return pageNum;
	}


	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}











}
