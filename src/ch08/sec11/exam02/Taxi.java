package ch08.sec11.exam02;

public class Taxi implements Vehicle {

	@Override
	public void run(String name) {
		System.out.println(name + "가 택시를 운전합니다");

	}

}
