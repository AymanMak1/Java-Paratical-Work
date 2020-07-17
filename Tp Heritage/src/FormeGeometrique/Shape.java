package FormeGeometrique;

public class Shape {
	protected String color;
	protected boolean filled;
	public Shape() {
		this.color="green";
		this.filled= true;
	}
	public Shape(String color, boolean filled) {
		this.color= color;
		this.filled= filled;
	}
	public boolean isFilled() {
		return filled;		
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		if(isFilled() == true)
		{
			return "A Shape with color of " + getColor() + " and filled";
		}
		else
		{
			return "A Shape with color of " + getColor() + " and NOT filled";

		}		
	}	

}
