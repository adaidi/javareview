package com.test.test;

public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("b1"+ b1);
		
		Book b2 = new Book("计算机书籍book2",400);
		System.out.println("b2"+ b2);
		
		Book b3 = new Book("计算机书籍book3",400,null);
		System.out.println("b3"+ b3);
		
		
//		b1.setTitle("计算机书籍");
//		b1.setPageNum(500);
//		b1.setType("语文");
		
		
//		b1.title = "计算机书籍";
//		b1.pageNum = 500;
//		b1.type ="英语"; 
		System.out.println(b1);
	}

}
