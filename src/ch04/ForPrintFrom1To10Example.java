package ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합:"+sum);
		/*
		 * for(int i=2; i<=9; i++) { for(int j=1; j<=9; j++) {
		 * System.out.print(i+"*"+j+"="+i*j+" "); } System.out.println(); }
		 */
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"X"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	
	}

}
