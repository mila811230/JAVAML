package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
//		car.run2();
		
		car.run3(
			new Tire() {
			@Override
			public void roll() {
				System.out.println("익명자식 타이어3 이 굴러갑니다");
				}
			}
		);
	}

}
