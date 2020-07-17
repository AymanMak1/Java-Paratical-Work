package FormeGeometrique;

public class CircleShape extends Shape{
	private double radius;
	public CircleShape() {
		super();
		setRadius(1.0);
	}
	public CircleShape(double radius) {
		super();
		this.setRadius(radius);
	}
	
	public CircleShape(double radius, String color, boolean filled) {
		this.setRadius(radius);
		super.color=color;
		super.filled=filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
    public double getArea( ) { return radius*radius*Math.PI; } 
    public double getPerimeter() { return radius * 2 ;}
    @Override public String toString() {
    	return "A Circle with radius = " + getRadius() + " which is a subclass of " + super.toString();
    }
}