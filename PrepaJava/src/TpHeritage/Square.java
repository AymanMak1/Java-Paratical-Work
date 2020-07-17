package TpHeritage;

public class Square extends Rectangle{

	private double side;
	
	public Square(){
		super();
		this.side = 1.0;
		super.length = side;
		super.width = side;	
	}
	
	public Square(double side){
		super();
		super.length = side;
		super.width = side;
		this.side = side;
	}
	public double getArea()
	{
		return side*side;
	}
	public double getPerimeter()
	{
		return 4*side;
	}
	public double getSide() {
		return side;
	}
}
