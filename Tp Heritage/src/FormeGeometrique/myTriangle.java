package FormeGeometrique;

public class myTriangle {
	private myPoint v1;
	private myPoint v2;
	private myPoint v3;

	public myTriangle(double x1,double x2,double x3,double x4,double x5,double x6) {
		this.v1 = new myPoint(x1,x2);
		this.v2 = new myPoint(x3,x4);
		this.v3 = new myPoint(x5,x6);
	}
	public myTriangle(myPoint v1,myPoint v2,myPoint v3)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;	
	}
	public String toString()
	{
		return "Triangle @ {" + v1.getX() + "," + v1.getY() + "}, "+ "{" +v2.getX() + "," + v2.getY() + "}, " + "{" + v3.getX() + "," + v3.getY() + "}." ;
	}
	public double getPerimeter()
	{
		double peri;
		peri =v1.distance(v2);
		peri += v2.distance(v3);
		peri += v3.distance(v1);
		
		return peri;
	}
	public void printType()
	{
		if(v1.distance(v2) == v2.distance(v3) && v2.distance(v3)==v3.distance(v1) && v3.distance(v1)== v1.distance(v2))
		{
			System.out.println("Equilateral");
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
