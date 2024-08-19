package ch08.sec08;

public class TV implements RemoteControl {

	@Override
	public void turnOn() {
		
		System.out.println("TV on");

	}

	@Override
	public void turnOff() {
		System.out.println("TV off");

	}

}
