package ch03;

public class LogicOperatorExample {

	public static void main(String[] args) {
		int charCode ='A';
		
		if((charCode>= 65) & (charCode<=90)) {
			System.out.println("대문자");
			
		}
		if((charCode >=97) && (charCode <=122)) {
			System.out.println("소문자");
		}

		
		int value =6;
		if((value %2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수");
			
		}
		
	}

}