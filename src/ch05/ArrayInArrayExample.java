package ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{99,88,55},{55,77,65},{55,55,44},{34,76,92},{55,55}};

		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++ ) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
