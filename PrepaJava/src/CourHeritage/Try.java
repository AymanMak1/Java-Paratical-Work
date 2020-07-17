package CourHeritage;

abstract public class Try {
	protected double n;
	protected double m;
	private String s;
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

	public void message() {
		System.out.println("Try.java");
	}
	
}
