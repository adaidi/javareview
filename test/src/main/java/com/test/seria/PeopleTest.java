package com.test.seria;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PeopleTest {
	public static void main(String[] args) throws IOException {
		People p1    = new People1();
		
		
		p1.name = "张三";
		p1.age = 23;
		System.out.println(p1);
		
//		FileOutputStream fileOut =  new FileOutputStream("d:/Hello.ser");
//		ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		out.writeObject(p1);
		
	}
}
