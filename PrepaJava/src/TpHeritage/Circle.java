package TpHeritage;

public class Circle extends Shape{
	
	protected double radius;
	public Circle(){
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		this.radius = radius;
		super.color = color;
		super.filled = filled;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString()
	{
		return "Cercle with Radius: "+radius+" "+super.toString();
	}

}

