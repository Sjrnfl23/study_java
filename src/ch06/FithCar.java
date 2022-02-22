package ch06;

public class FithCar {

	int speed;
	
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 훕칩니다.");
	}
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속::"+speed+"km/h)");
		}
	}
}
