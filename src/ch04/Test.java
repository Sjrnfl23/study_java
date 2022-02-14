package ch04;

public class Test {

	public static void main(String[] args) {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				sum = i * j;
				System.out.print(j + "X" + i + "=" + sum + " \t");
				if (sum % 2 == 0) {
					evensum += sum;
				} else {
					oddsum += sum;
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.print("홀수의 합:" + oddsum);
		System.out.println(" 짝수의 합:" + evensum);

	}

}
