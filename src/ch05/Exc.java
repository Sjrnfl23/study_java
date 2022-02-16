package ch05;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intValue1= {2,3,4,5,6,7,8,9};
		int [] intValue2= {1,2,3,4,5,6,7,8,9};
		

	for(int i=0; i<intValue1.length; i++) {
		
		for(int j=0; j<intValue2.length; j++) {
			
			System.out.print(intValue1[i]+"X"+intValue2[j]+"="+intValue1[i]*intValue2[j]+"\t");
		}
		
		System.out.println();
	}
	
	}

}
