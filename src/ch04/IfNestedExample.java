package ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score =98;
		String grade ="";
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}
			else {
				grade="A";
			}
		}
		else if(score >=80) {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		
		System.out.println("학점용: "+grade);
	}

}
