package ch06;

public class FourthCarExample {

	public static void main(String[] args) {


		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(5);
		
		boolean gasState = fourthCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			fourthCar.run();
		}
		if(fourthCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요");
		}

	}

}
