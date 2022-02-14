package ch04;

public class SwitchStringExample {

	public static void main(String[] args) {

		String position = "과장";

		int num = (int) (Math.random() * (6 - 1 + 1) + 1);
		System.out.println(num);
		switch (position) {
		case "사원":
			System.out.println("월급300만원");
			break;
		case "대리":
			System.out.println("월급400만원");
			break;
		case "과장":
			System.out.println("월급500만원");
			break;
		case "부장":
			System.out.println("월급600만원");
			break;
		default:
			System.out.println("최저시급");
			break;
		}

		int num1 = (int) (Math.random() * (6) + 1);
		int num2 = (int) (Math.random() * (6) + 1);
		int sum = num1 + num2;

		System.out.println("첫번쨰 주사위는 " + num1 + "번 입니다.");
		System.out.println("두번쨰 주사위는 " + num2 + "번 입니다.");
		System.out.println("두수의 합은 " + sum + " 입니다");
		
		

	}
}
