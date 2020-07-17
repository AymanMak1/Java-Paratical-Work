package FormeGeometrique;

public class Square extends ARectangle {
	public Square(double side) {
		setLength(side);
		setWidth(side);
	}
	public double getArea( ) { return super.getArea(); } 
	public double getPerimeter() { return super.getPerimetre() ;}
	public void setLength(double length) {
		super.setLength(length);
	}
	public void setWidth(double width) {
		super.setWidth(width);
	}
	@Override public String toString() {
		return "A Square with side= " + super.getWidth() +" which is a subclass of: " + super.toString();
	}

	public double getSide() {
		return getLength() ;
	}
}