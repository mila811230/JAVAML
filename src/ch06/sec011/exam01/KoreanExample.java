package ch06.sec011.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		
		//final은 초깃값이 불변임
		Korean kml = new Korean();
		kml.ssn = "811230-2111111";
		kml.name = "미라";
//		kml.nation = "대한민국";
//		
		System.out.printf("%s %s %s \n", 
				kml.nation,
				kml.ssn,
				kml.name);
//		
//		kml.name = "바다바";
//		kml.ssn  = "000000-2222222";
//		
//		System.out.printf("%s %s %s \n",
//				kml.nation,
//				kml.ssn,
//				kml.name);

	}

}
