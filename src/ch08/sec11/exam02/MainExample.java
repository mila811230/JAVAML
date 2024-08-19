package ch08.sec11.exam02;

public class MainExample {

	public static void main(String[] args) {
		Driver driver = new Driver("강미라");
		
		Bus bus = new Bus();
		driver.driver(bus);
		
		Taxi taxi = new Taxi();
		driver.driver(taxi);

	}

}
