package com.canway.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class TestFile {
	public static void main(String[] args) throws IOException {
		
//		C:\Users\Administrator\Desktop\java
		String src = "C:/Users/Administrator/Desktop/java/test.txt";
		File file = new File(src);	
//		writer(file);
		read(file);
	}
	
	// 文件写入
	public static void writer(File file) throws IOException {
//		OutputStream out = new FileOutputStream(file,true);
//		out.write("这里是输出流测试;".getBytes());
//		out.close();
		
		Writer writer = new FileWriter(file, true);
		writer.write("测试；");
		writer.close();
	}
	
	
	public static void read(File file) throws IOException {
//		字节流文件读取
//		InputStream  fileIn = new FileInputStream(file);
//		byte[] buf = new byte[1024];
//		int count = 0;
//		while((count = fileIn.read(buf)) > 0 ) {
//			System.out.println(new String(buf));
//		}
//		//关闭流
//		fileIn.close();
		Reader reder = new FileReader(file);
		BufferedReader bufReder = new BufferedReader(reder);
		
		
		String strLine ="";
		while((strLine = bufReder.readLine() ) != null) {
			System.out.println(strLine);
		};
		bufReder.close();
		reder.close();
		
	}
	
	
	public static void mkdir(File file) throws IOException {
//		目录创建
//		System.out.println(file.isDirectory());
//		if(!file.exists()) {
//			if(file.mkdirs()) {
//				System.out.println("目录创建成功");
//			};
//		}
		//文件的创建
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("文件创建成功");
			};
		}
		
	}
	
	
	
	
	
	
}
