package ch04;

public class IfElseExample {

	public static void main(String[] args) {
		
		int score =65;
		if(score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A 입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89점 사이");
			System.out.println("등급은 B 입니다");
		}else if(score>=70){
			System.out.println("점수가 70~79점 사이");
			System.out.println("등급은 C입니다");
		}else if(score >=60) {
			System.out.println("점수가 60~69점 사이");
			System.out.println("등급은 D입니다");
		}else {
			System.out.println("60점 미만");
			System.out.println("등급은F");
		}
		   int a=3;
		    int b=4;
		    
		    if(a>b) {
		    	System.out.println(">");
		    }else if(b>a) {
		    	System.out.println("<");
		    }else {
		    	System.out.println("==");
	}
 
    }

}
