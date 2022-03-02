package ch07;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL =1;
	public static final int SUPERSONIC=2;
	
	public int flyMode = Constants.NORMAL;
	
	public void fly() {
		if(flyMode == Constants.SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
		
	}
	
	
	
}
