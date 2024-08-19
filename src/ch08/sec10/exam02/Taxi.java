package ch08.sec10.exam02;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시는 미터당 요금입니다");

	}
	
	@Override
	public void destination() {
		System.out.println("목적지는 어디인가");
		
	}

}
