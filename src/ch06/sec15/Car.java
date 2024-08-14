
package ch06.sec15;

public class Car {
	public void func() {
		
		Singleton obj3 = Singleton.getInstance();
		obj3.color = "black";
		System.out.printf("obj3 => %s \n", System.identityHashCode(obj3));
	}

}
