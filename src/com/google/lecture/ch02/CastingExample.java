package com.google.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue =44032;
		System.out.println("intValue: "+intValue);
		
		char charValue=(char) intValue;
		System.out.println(charValue);
		
		long longValue=500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue =(int)doubleValue;
		System.out.println(intValue);
		
		int a=10;
		double b=10.0;
		int c=(a+(int)b);
		double e=a+b;
		System.out.println(e);
	}

}
