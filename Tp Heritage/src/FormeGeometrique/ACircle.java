package FormeGeometrique;

public class ACircle extends AShape{

	private double radius;
	
	public ACircle() {
		super();
		setRadius(1.0);
	}
	
	public  ACircle(double radius) {
		super();
		this.setRadius(radius);
	}
	
	public ACircle(double radius, String color, boolean filled) {
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
	
	public String toString() {
    	return "A Circle with radius = " + getRadius() + " which is a subclass of " + super.toString();
    }
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
	@Override
	public double getPerimetre() {
		return radius * 2;
	}

}