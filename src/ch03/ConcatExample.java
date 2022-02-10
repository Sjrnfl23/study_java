package ch03;

public class ConcatExample {

	public static void main(String[] args) {
		String str1= "JDK"+1.8;
		String str2= str1+ "입니다.";
		
		System.out.println("str2: "+str2);

		String strA="권순형 ";
				String strB=": 010-5185-5844";
				String strC=strA+strB;
				
				System.out.println("strC: "+ strC);
	}

}
