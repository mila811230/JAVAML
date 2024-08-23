package ch13.sec02.exam02;

public class RentableExample {

	public static void main(String[] args) {
		
		HomeAgency ha = new HomeAgency();
		Home home = ha.rent();
		home.turnOff();
		
		CarAgency ca = new CarAgency();
		Car car = ca.rent();
		car.run();

	}

}
