package FormeGeometrique;

public class myPoint {

	private double x;
	private double y;
	
	public myPoint(){
		this.x = 0;
		this.y = 0;
	}
	public myPoint(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setXY(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "( "+this.x+" , "+this.y+" ) ";
	}
	public double distance(double x,double y)
	{
		double dist;
		dist = Math.sqrt( Math.pow(this.x-x,2) + Math.pow(this.y-y,2) );
		return dist;
	}
	public double distance(myPoint another)
	{
		
		return ( Math.sqrt( Math.pow(another.x-x,2) + Math.pow(another.y-y,2) ) );
	}

}
