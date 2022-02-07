package com.google.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		int intvalue=10;
		System.out.println(intvalue);
		
		char charValue='가';
		System.out.println(charValue);

		intvalue=charValue;
		System.out.println("가의 유니코드="+intvalue);
		
		
		double doublevalue=intvalue;
		System.out.println("doublevalue: "+doublevalue);
		
	}

}
