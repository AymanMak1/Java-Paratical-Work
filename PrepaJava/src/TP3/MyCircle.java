package TP3;

public class MyCircle {
	private MyPoint centre;
	private double radius;
	public MyCircle(double x, double y) {
		centre = new MyPoint(x,y);
		
	}
	public MyCircle(double x, double y,double r) {
		this(x,y);
		setRadius(r);	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public MyPoint getCentre() {
		return centre;
	}
	public void setCentre(double x,double y) {
		this.centre=new MyPoint(x,y);
	}
	public String toString() {
		return "Circle @ " + centre + " radius " + radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}

}
