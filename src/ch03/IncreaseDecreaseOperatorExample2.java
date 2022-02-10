package ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		int x=10;
		++x;
		System.out.println(x);

		int y=10;
		y++;
		System.out.println(y);
		
		int a=0;
		int b=0;
		
		a= ++x; 
		b= x++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		
		
      
	}

}
