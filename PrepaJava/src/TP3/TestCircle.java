package TP3;

public class TestCircle {

	public static void main(String[] args) {
		MyCircle c1= new MyCircle(4.8,3.2,2);
		System.out.println(c1);
		System.out.println("Centre: " +c1.getCentre());
		System.out.println("Area : " + c1.getArea());
		c1.setCentre(2.8,3.2);
		c1.setRadius(1.2);
		System.out.println("New coordinates for Circle c1: " + c1);

	}

}
