package FormeGeometrique;

public class RectangleShape extends Shape {
	private double width;
	private double length;
	public RectangleShape() {
		this.setWidth(1.0);
		this.setLength(1.0);
	}
	public RectangleShape(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}
	public RectangleShape(double width, double length,String color,boolean filled ) {
		this.setWidth(width);
		this.setLength(length);	
		super.color=color;
		super.filled=filled;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
    public double getArea( ) { return width * length; } 
    public double getPerimeter() { return 2 * width + 2*length ;}
	@Override public String toString() {
		return "A Rectangle with width=  " + getWidth() + " and length= "+ getLength() +" which is a subclass of " + super.toString();
	}

}

