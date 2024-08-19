package ch08.sec10.exam02;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달린다");

	}
	
	@Override
	public void destination() {
		System.out.println("목적지는 어디인가");
		
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
		
	}

}
