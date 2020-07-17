package TP3;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint p1= new MyPoint();
		System.out.println(p1);
		p1.setXY(2.8, 3.2);
		System.out.println("p1's coordinates have been set : " + p1);
		System.out.println("Distance between this (x,y) and the two other coordinates is :" + p1.distance(1.8,2.4));
		MyPoint p2= new MyPoint(1.2,4.3);
		System.out.println("Distance between Points p1 , p2 " + p1.distance(p2));
		MyPoint [] pts = new MyPoint[10];
		// remplisasage
		for(int i=0; i < 10;i++) {
			pts[i]=new MyPoint(i+1,i+1);
		}
		//affichage
		System.out.println("Affichage du tableau: ");
		for(int i=0; i < 10;i++) {
			System.out.println(pts[i]);
		}
		


	}

}
