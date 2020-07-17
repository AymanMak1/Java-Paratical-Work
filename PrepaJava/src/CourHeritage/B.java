package CourHeritage;

public class B extends A {
	private int bn;
	public B(int x, int y,int bn) {
		super(x,y);
		this.setBn(bn);
	}
	public String Increment(int x1,int x2) {
		return "hANII";
	}
	public int getBn() {
		return bn;
	}
	public void setBn(int bn) {
		this.bn = bn;
	}
	
}
