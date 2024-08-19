package ch08.sec11.exam02;

public class Bus implements Vehicle {

	@Override
	public void run(String name) {
		System.out.println(name + "가 버스를 운전합니다");

	}
	
	public void checkFare () {
		System.out.println("버스요금을 확인합니다");
		
	}

}
