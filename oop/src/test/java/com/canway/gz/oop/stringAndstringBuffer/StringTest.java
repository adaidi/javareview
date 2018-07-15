package com.canway.gz.oop.stringAndstringBuffer;

public class StringTest {
	
	public static void main(String[] args) {
		stringTime();
		stringBufferTime();
	}
	
	public static void stringTime() {
		 String tempstr = "ab";
	        int times = 5000;
	        long lstart1 = System.currentTimeMillis();
	        String str = "";
	        for (int i = 0; i < times; i++) {
	            str += tempstr;
	        }
	        long lend1 = System.currentTimeMillis();
	        long time = (lend1 - lstart1);
	        System.out.println(time);
	}
	
	public static void stringBufferTime() {
		 String tempstr = "ab";
	        int times = 5000;
	        long lstart2 = System.currentTimeMillis();
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < times; i++) {
	            sb.append(tempstr);
	        }
	        long lend2 = System.currentTimeMillis();
	        long time2 = (lend2 - lstart2);
	        System.out.println(time2);
	}

}
