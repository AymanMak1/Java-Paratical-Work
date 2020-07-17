package TP3;

public class Triangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
		v1= new MyPoint(x1,y1);
		v2= new MyPoint(x2,y2);
		v3= new MyPoint(x3,y3);	
	}
	public void myTriangle(MyPoint v1,MyPoint v2,MyPoint v3)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public String toString() {
		return "Triangle @ " + v1 + " " + " " + v2 + " " + v3; 
	}
	public double getPerimeter()
	{
		double peri;
		peri =v1.distance(v2);
		peri += v2.distance(v3);
		peri += v3.distance(v1);
		
		return peri;
	}
	public void printType() {
		if(v1.distance(v2) ==  v2.distance(v3) && v2.distance(v3) == v3.distance(v1) && v1.distance(v2) ==  v3.distance(v1)) {
			System.out.println( "equilateral" );
		}
		else if(v1.distance(v2) == v2.distance(v3) || v2.distance(v3)==v3.distance(v1) || v3.distance(v1)== v1.distance(v2))
		{
			System.out.println("Isocèle");
		}
		else {
			System.out.println("Scalene");
		}
	}
}
