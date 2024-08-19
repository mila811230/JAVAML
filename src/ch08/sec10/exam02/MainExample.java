package ch08.sec10.exam02;

public class MainExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		Vehicle vehicle1 = new Taxi();
		
		vehicle.run();
		
//		((Bus)vehicle).checkFare();
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		bus.run();
		
		Taxi taxi = (Taxi)vehicle1;
		taxi.run();
		taxi.destination();

	}

}
