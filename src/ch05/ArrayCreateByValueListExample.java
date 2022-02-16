package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] score = { 83, 90, 87, 99 };

		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("score[3]: " + score[3]);

		double avg = 0;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += score[i];
		}
		avg = sum / 4;
		System.out.println("총합은 :" + sum);
		System.out.println("평균은 :" + avg);
	}

}
