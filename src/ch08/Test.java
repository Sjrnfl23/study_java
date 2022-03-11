package ch08;

public interface Test {
	public String name="abcd";
	
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	// 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// public 생략 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBettery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
