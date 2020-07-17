package CourHeritage;

public class RealLastTry extends Try {
	public static int nbObject=0;
	private double dyali1;
	private String dyali2;
	public RealLastTry() {
		super();
		this.setDyali1(1.0);	
		this.setDyali2("damn");
		nbObject++;
	}
	public RealLastTry(double dyali1, String dyali2) {
		super();
		this.setDyali1(dyali1);	
		this.setDyali2(dyali2);
		nbObject++;
	}
	public RealLastTry(double n, double m, double dyali1, String dyali2) {
		this.setDyali1(dyali1);	
		this.setDyali2(dyali2);
		super.n= n;
		super.m=m;
		nbObject++;
	}
	public double getDyali1() {
		return dyali1;
	}
	public void setDyali1(double dyali1) {
		this.dyali1 = dyali1;
	}
	public String getDyali2() {
		return dyali2;
	}
	public void setDyali2(String dyali2) {
		this.dyali2 = dyali2;
	}
	public static int getNbObject() {
		return nbObject;
	}
	@Override
	public void message() {
		System.out.println("RealLastTry.java");
	}
	@Override
	public void setN(double n) {
		this.n = n;
	}
	@Override
	public double getM() {
		return m;
	}
	@Override
	public void setM(double m) {
		this.m = m;
	}
	
}
