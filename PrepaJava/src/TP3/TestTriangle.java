package TP3;

public class TestTriangle {

	public static void main(String[] args) {
		// 1er methode/constructeur
		Triangle t = new Triangle(4.2,5.3,4.3,2.8,1.2,3.4);
		System.out.println(t);
		System.out.println("Perimetre : " + t.getPerimeter());
		t.printType();
		// 2eme methode/constructeur
		MyPoint po1= new MyPoint(3,2.1);
		MyPoint po2= new MyPoint(4.2,1.8);
		MyPoint po3= new MyPoint(2.5,3.1);
		//Triangle t2 = new Triangle(po1,po2,po3);
		//System.out.println(t2);
	}

}
