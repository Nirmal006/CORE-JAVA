package oopsconcept;

public class ShapeConstructor {
	static int area (int l, int b) {
		return l*b;
	}
	static double circle(double pie,double r) {
		return pie *(r*r);
		
	}

	public static void main(String[] args) {
		System.out.println("area of square:"+ ShapeConstructor.area(20,18));
		System.out.println("area of circle:"+ShapeConstructor.circle(3.14, 6));
		
		

	}
}
