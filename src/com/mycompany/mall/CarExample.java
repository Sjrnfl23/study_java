package com.mycompany.mall;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("company: "+car.company);
		System.out.println("model: "+car.model);
		System.out.println("color: "+car.color);
		System.out.println("maxSpeed: "+car.maxSpeed);
		System.out.println("speed: "+car.speed);
		
		car.speed =100;
		
		System.out.println(car.speed);
		checkSpeed(car.speed,car.maxSpeed);
	}
	
	public static void checkSpeed(int speed,int maxSpeed) {
		if(speed>maxSpeed) {
			System.out.println("최고 속력을 초과했습니다.");
		}else {
			System.out.println("속력이 최고 속력보다 낮거나 같습니다.");
		}
	}

}
