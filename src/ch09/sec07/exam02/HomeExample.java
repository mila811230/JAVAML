package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		
		Home home = new Home();
		home.useTV();
		home.useAircon();
		home.useRC(
				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("난방기를 켭니다");
					}

					@Override
					public void turnOff() {
						System.out.println("난방기를 끕니다");	
					}	
			  }
		);

	}

}
