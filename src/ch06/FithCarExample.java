package ch06;

public class FithCarExample {

	public static void main(String[] args) {
		FithCar fithCar = new FithCar();
		
		fithCar.keyTurnOn();
		fithCar.run();
		int speed = fithCar.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");

	}

}
