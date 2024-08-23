package ch13.sec02.exam01;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Car, String> car1 = new Product<>();
		car1.setKind(new Car());
		car1.setModel("제네시스");
		
		System.out.printf("%s 가 ", car1.getModel());
		car1.getKind().run();
	}

}
