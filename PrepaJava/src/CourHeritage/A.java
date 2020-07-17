package CourHeritage;

public class A {
	private int n1;
	private int n2;
	public A() {
		this(1,3);
	}
	public A(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	public String Increment(int x1,int x2) {
		return this.n1+x1 + " " + this.n2+x2;
	}
}
