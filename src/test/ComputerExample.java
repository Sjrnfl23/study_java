package test;

public class ComputerExample {

	public static void main(String[] args) {
		int r=7;
		System.out.println("원의 반지름:"+r);
		
		System.out.println();
		
		System.out.println("Calculator 객체의 원면적");
		Calculator cal=new Calculator();
		double cal_circleArea=cal.gerCircleArea(r);
		System.out.println("원면적:"+cal_circleArea);
		
		System.out.println();
		
		System.out.println("Calculator 객체의 원면적");
		Computer com=new Computer();
		double com_circleArea=com.gerCircleArea(r);
		System.out.println("원면적:"+com_circleArea);
	}

}
