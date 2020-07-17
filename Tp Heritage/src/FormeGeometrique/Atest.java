package FormeGeometrique;

public class Atest {

	public static void main(String[] args) {
		
		AShape s1 = new ACircle(5.5, "RED", false); // Upcast Circle à Shape
		System.out.println(s1);
		System.out.println(s1.getArea()); System.out.println(s1.getPerimetre());
		System.out.println(s1.getArea()); System.out.println(s1.getPerimetre());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(((ACircle)s1).getRadius() + "\n");
		

		
		ACircle c1 = (ACircle)s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimetre());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius() + "\n");
		
		
		
		AShape s3 = new ARectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimetre());
		System.out.println(s3.getColor());
		System.out.println(((ARectangle)s3).getLength() + "\n");
		
		ARectangle r1 = (ARectangle)s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		
	
		
		
		Square s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide());
		
		ARectangle r2 =  (ARectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		
		//System.out.println(s4.getSide());
		
		
		/*
		ARectangle r2 = (ARectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		
		System.out.println(r2.getLength());
		// convertion de Rectangle r2 à Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		
		*/
	}

}
