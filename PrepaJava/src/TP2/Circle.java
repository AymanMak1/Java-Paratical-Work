package TP2;

public class Circle {

	public static int nbCircle=0;
	private double radius;
	private String color;
	public Circle() {
		this(1.0);
		nbCircle++;
	}
	public Circle(double r) { 
		radius = r; 
		color = "red";
		nbCircle++;
	}
	public Circle(double r,String c) { 
		radius = r; 
		color = c;
		nbCircle++;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius; 
	}
	
	public double getArea() {
		return radius*radius*Math.PI; 
	}
	
	public void setColor(String c) {
		color=c; 
	}
	
	public String getColor() {
		return color;
		
	}
	public static int getNbCircle() {
		return nbCircle;
	}
	public String toString() { return this.getClass().getName() + ": radius=" + radius + " color=" + color;}

}
