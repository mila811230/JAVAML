package ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton();
	public String color = "blue";
	public int    index = 0;

	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

}