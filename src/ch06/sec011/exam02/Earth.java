package ch06.sec011.exam02;

public class Earth {
	static double Earth_Radius = 6400;
	static double Earth_Surface_Area;
	
	static {
		Earth_Surface_Area = 4 * Math.PI * Earth_Radius * Earth_Radius; 
	}

}
