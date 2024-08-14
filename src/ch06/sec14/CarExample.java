package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("파란색");
		String car_color = car.getColor();
		System.out.printf("자동차 색상: %s\n", car_color);
		
		//getter, setter
		car.setColor("빨강");
		car_color = car.getColor();
		System.out.printf("자동차 색상: %s\n", car_color);
		

	}

}