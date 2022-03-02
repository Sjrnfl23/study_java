package ch07;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		Calculator cal = new Calculator();
		
		System.out.println("원면적: "+cal.areaCircle(2));
		
		
		Computer computer = new Computer();
		
		System.out.println("원면적: "+computer.areaCircle(2)); 
	}

}
