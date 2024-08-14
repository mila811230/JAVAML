package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		
		//Car.maxSpeed = 200;
		
		Car myCar = new Car();		
		myCar.maxSpeed = 300;
		System.out.printf("법정제한속도:%d, 회사명1 : %s, 속도: %d, 색상: %s \n"
				, myCar.maxSpeed, myCar.company 
				, myCar.speed, myCar.color);
		myCar.setColor("파란색");
		Car.setMaxSpeed(200);
		System.out.printf("법정제한속도:%d, 회사명2 : %s, 속도: %d, 색상: %s \n",
				myCar.maxSpeed,myCar.company 
				, myCar.speed, myCar.color);
//
		Car myCar2 = new Car("삼성자동차");
		myCar2.setMaxSpeed2(100);
		System.out.println("법정제한속도:"+myCar2.maxSpeed+", 회사명2 : "  +myCar2.company
				+ ", 속도 : " +myCar2.speed);
//
//		Car myCar3 = new Car(120);
//		System.out.println("회사명3 : "  +myCar3.company 
//				+ ",속도 : " +myCar3.speed);
//		
//		Car myCar4 = new Car("KGM",120);
//		System.out.println("회사명4 : "  +myCar4.company 
//				+ ",속도 : " +myCar3.speed);

	}

}