package FormeGeometrique;

public class TestFormes {
			public static void main(String[] args) {
				myPoint p= new myPoint(1,1);
				System.out.println(p);
				Cercle c= new Cercle(1.25);
				System.out.println(c);
				System.out.println(c.getArea());
				myTriangle t= new myTriangle(1.25,2.2,3,4.5,6.2,1.8);
				System.out.println(t);	
			}
}