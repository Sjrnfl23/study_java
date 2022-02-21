package com.mycompany.mall;

public class KoreanExample {

	public static void main(String[] args) {
		Korean korean = new Korean();
		
		System.out.println("korean.ssn: "+korean.ssn);
		System.out.println("korean.name: "+korean.name);
		System.out.println("korean.nation: "+korean.nation);
		
		korean.name="장원영";
		korean.ssn="03043141412";
		
		System.out.println("--------------------------");
		System.out.println("korean.ssn: "+korean.ssn);
		System.out.println("korean.name: "+korean.name);
		System.out.println("korean.nation: "+korean.nation);
		
		Korean korean2 =new Korean("전지현","9351935915");
		
		System.out.println("--------------------------");
		System.out.println("korean.ssn: "+korean2.ssn);
		System.out.println("korean.name: "+korean2.name);
		System.out.println("korean.nation: "+korean2.nation);
		
		Korean korean3 =new Korean("고소영","729381834123");
		
		System.out.println("--------------------------");
		System.out.println("korean.ssn: "+korean3.ssn);
		System.out.println("korean.name: "+korean3.name);
		System.out.println("korean.nation: "+korean3.nation);
	}

}
