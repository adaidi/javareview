package com.canway.gz.oop.stringAndstringBuffer;

public class EqualsTest {
	public static String s  ;
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test1() {
		 s = "abc";
		String p = "abc";
		System.out.println("test1:s==p的結果是：" + (s == p));
		System.out.println("test1:s.equals(p)的結果是：" + s.equals(p));
	}
	
	public static void test2() {
		String s = new String("abc");
		String p = new String("abc");
		System.out.println("test2:s==p的結果是：" + (s == p));
		System.out.println("test2:s.equals(p)的結果是：" + s.equals(p));
	}

}
