package ch08.sec08;

public class SmartTV implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println("SmartTV searching :" + url);
		
	}
	@Override
	public void turnOn() {
		System.out.println("SmartTV on");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV off");

	}

}
