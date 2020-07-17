package TpHeritage;


public class MovablePoint implements Movable{

	int x;
	int y;
	int xSpeed;
	int ySpeed;
	public MovablePoint() {
		this(0,0,1);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public MovablePoint(int x,int y,int speed) 
	{
		this.x = x;
		this.y = y;
		this.xSpeed = speed;
		this.ySpeed = speed;
	}
	public void moveUp()
	{
		x+=xSpeed;
	}
	public void moveDown()
	{
		x-=xSpeed;
	}
	public void moveLeft()
	{
		y-=ySpeed;
	}
	public void moveRight()
	{
		y+=ySpeed;
	}

}

