package TP3;

public class MyPoint {
	private double x;
	private double y;
	public MyPoint() {
		this(0.0,0.0);
	}
	public MyPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setXY(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "( "+this.x+" , "+this.y+" ) ";
	}
	public double distance(double x, double y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	public double distance(MyPoint pt)
	{
		return distance(pt.x,pt.y);
	}

}
