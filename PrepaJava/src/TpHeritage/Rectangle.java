package TpHeritage;

public class Rectangle extends Shape{
	
	protected double length;
	protected double width;
	public Rectangle() {
		this(1.0,1.0);
		/*
		this.length = 1.0;
		this.width = 1.0;
		*/
	}
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public Rectangle(double length,double width,String color,boolean filled)
	{
		this.length=length;
		this.width=width;
		super.color = color;
		super.filled = filled;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return "Rectangle : width : "+width+" / length : "+length;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	

}

