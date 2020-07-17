package TpHeritage;


public class MovableCircle implements Movable{

	MovablePoint center;
	double radius;
	public MovableCircle() 
	{
		this(1.0,new MovablePoint());
	}
	public MovableCircle(double radius,MovablePoint center)
	{
		this.center = center;
		this.radius = radius;
	}
	public MovableCircle(double radius,int x,int y,int speed)
	{
		this(radius,new MovablePoint(x,y,speed));
	}
	public void moveUp()
	{
		center.x+=center.xSpeed;
	}
	public void moveDown()
	{
		center.x-=center.xSpeed;
	}
	public void moveLeft()
	{
		center.y-=center.ySpeed;
	}
	public void moveRight()
	{
		center.y+=center.ySpeed;
	}

}

