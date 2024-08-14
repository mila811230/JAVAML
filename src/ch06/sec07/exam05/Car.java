package ch06.sec07.exam05;

public class Car {
	//필드선언
	String company = "제네시스";
	String  model;
	String  color;
	int maxSpeed;
	
	//생성자 선언	
	Car(String model) {
		this(model, "빨강",250);
	}
	
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
