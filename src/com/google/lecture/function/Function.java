package com.google.lecture.function;

public class Function {

	public static void main(String[] args) {

		int a = add(4, 3);
		int b = subtract(4, 3);
		int c = multiplicate(4, 3);
		double d = divide(4.0, 3.0);

		System.out.println("더한 값:" + a);
		System.out.println("뺀 값:" + b);
		System.out.println("곱한 값:" + c);
		System.out.println("나눈 값:" + d);
		
		
		print(food("일식"));
		
	}

	public static String abc(String a, String b) {
		String c= a+b;
		return c;
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtract(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int multiplicate(int a, int b) {
		int sum = a * b;
		return sum;
	}

	public static double divide(double a, double b) {
		double sum = a / b;
		return sum;
	}
	
	public static String[] food(String a) {
		String [] foods= new String[3];
		switch(a) {
		case "중식": foods= new String [] {"짜장면","짬뽕","우동"}; break;
		case "일식": foods= new String [] {"초밥","라멘","소바"}; break;
		case "양식": foods= new String [] {"스테이크","스파게티","리조또"}; break;
		case "한식": foods= new String [] {"냉면","제육볶음","김치찌개"}; break;
		}
		
		
		return foods;
	}
	public static void print(String []a) {
		int i=(int)(Math.random()*3);
			
			System.out.println("오늘 추천 드리는 메뉴는 "+a[i]+"입니다");
		
	}

}
