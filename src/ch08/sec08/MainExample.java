package ch08.sec08;

public class MainExample {

	public static void main(String[] args) {
		
		RemoteControl rcTV = new TV();
		rcTV.turnOn();
		rcTV.turnOff();
		
		
		RemoteControl rcSmartTV = new SmartTV();
		rcSmartTV.turnOn();
		rcSmartTV.turnOff();
		
		Searchable rcSmartTV2 = new SmartTV();
		rcSmartTV2.search("유튜브");

	}

}
