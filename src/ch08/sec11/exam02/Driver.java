package ch08.sec11.exam02;

public class Driver {
	private String name = "";
	public Driver(String name) {
		this.name = name;
	}
	
	void driver(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			System.out.println(this.name + "는 대형면허가 없습니다");
		}
		vehicle.run(this.name);
	}

}
