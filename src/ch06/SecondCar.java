package ch06;

public class SecondCar {

	String company = "현대자동차";
	String model = "";
	String color = "";
	int maxSpeed = 0;

	public SecondCar() {

	}

	public SecondCar(String model) {
		
		this(model, null, 0);

	}

	public SecondCar(String model, String color) {

		this(model, color, 0);

	}

	public SecondCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

}
