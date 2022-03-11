package ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Audio audio = new Audio();
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		RemoteControl remoteControl;
		remoteControl=new Audio();
		
		RemoteControl remoteControl2= new Audio();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		
		RemoteControl remoteControl3= new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("안녕");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		remoteControl3.turnOn();
	}

}
