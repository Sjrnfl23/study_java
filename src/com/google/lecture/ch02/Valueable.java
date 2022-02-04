package com.google.lecture.ch02;

public class Valueable {

	public static void main(String[] args) {
		
		/* boolean defaultNy = true; */
		String fullName="kwon soonghyoung";
		String name="soonhyoung";
		
		int roomNumber=1;
		int roomnumber=2;
		
		System.out.println(roomNumber);
		System.out.println(roomnumber);
		
		int a=1; //선언. 사용불가
		int b=1;
		int c=0;
		
		// c=a+b;		//초기화 되지 않은 변수 사용=에러
		boolean defaultNy=false;
		byte aa=0;
		short bb=0;
		int cc=0;
		long dd=0;
		
		float ee =0.0f;
		double ff=0.0;
		
		char gg = ' ';
        String hh = "";
        
        System.out.println(c);
        System.out.println("soonhyoung");
        System.out.println("soonghyoung kwon:" + c + " warm");
        
        System.out.println("한칸줄여쓰기");
        System.out.println("\t한칸줄여쓰기");
        
        System.out.println("한줄바꿈");
        System.out.println("\n한줄바꿈");
        
        System.out.println("한줄바꿈2");
        System.out.println("\r한줄바꿈");
        
        System.out.println("\'나는생각한다\'");
        System.out.println("소크라테스가 말했다 \"나는 존재한다.\"");
        System.out.println("\\");
        
        if(a==1) {
        	int aaa = 10;
        	int bbb = aaa+ a;
        	System.out.println("bbb: "+ bbb);
        }else {
        	
        }
       
        
        
	}

}
