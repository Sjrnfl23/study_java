package ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		

	}

}
