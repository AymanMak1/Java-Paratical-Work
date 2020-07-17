package FormeGeometrique;

abstract class AShape {
	protected String color;
	protected boolean filled;
	
	public boolean isFilled() {
		return filled;		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	abstract double getArea();
	abstract double getPerimetre();
	public String toString() {
		return "";
	}
	//protected abstract double getRadius();

}
