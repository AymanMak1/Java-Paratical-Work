package TP2;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + 
		c1.getArea());
		
		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + 
		c2.getArea());
		
		Circle c3 = new Circle(2.3,"Pink");
		System.out.println(c3);
		System.out.println("le couleur d'objet c3: " + c3.getColor());
		
		Circle c4 = new Circle(4.8);
		System.out.println(c4);
		
		System.out.println(Circle.getNbCircle());
		
	}
}


