package TpHeritage;

abstract public class Shape {

	protected String color;
	protected boolean filled;
	abstract public double getPerimeter();
	public boolean isFilled()
	{
		return filled;
	}
	public String toString()
	{
		if(isFilled() == true)
			return "A Shape with color of "+this.color+" and Filled";
		return "A Shape with color of "+this.color+" and not filled";
		
	}
	public String getColor() {
		return color;
	}
	protected abstract double getArea();
	

}