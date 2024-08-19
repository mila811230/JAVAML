package ch08.sec11.exam01;

public class MainExample {

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		myCar.run();
		
		
		//금호로 교체
		
		myCar.tireFront = new KumhoTire();
		myCar.tireBack = new KumhoTire();
		myCar.run();

	}

}
