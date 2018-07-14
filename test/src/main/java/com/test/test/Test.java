package com.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		char a = 'a';
		
		int b = 23;
		
		
		
		long lo = b;
		
		int  c = (int) lo;
		
		System.out.println(b);
		
		
		String  str = "这里是string";
		
		char[] chars = new char[5];
		
//		 new String[5]
		String[] names = {"abc","dd"};
		names[0] ="adf";
		
		
		String[][] ages = new String[2][2];
		
		ages[0][0] = "asd";
		ages[0][1] = "asd";
		ages[1][0] = "asd";
		ages[1][1] = "asd";
		
		chars[0] = '这';
		chars[1] = '里';
		chars[2] = '是';
		
//		String[] names = new String[4];
		//list
		List li = new ArrayList<>();
		li.add("你好");
		li.add("你好");
		li.add("你好");
		li.add("你好");
		li.add("你好");
		li.add("你好");
		li.add("你好");
		
		
		Set  set = new HashSet<>();
		
		set.add("sdfs");
		
		
		Map map = new HashMap<>();
		map.put("key", "value");
		map.get("key");
		
		
		
		
		
	}
}
