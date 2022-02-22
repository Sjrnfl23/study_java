package ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		ThirdCalculator thirdCalculator=new ThirdCalculator();
		
		double a=3.0;
		double b=4.0;
		
		double result1= thirdCalculator.areaRectangle(a);
		
		double result2 = thirdCalculator.areaRectangle(a,b);
		
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
	}

}
