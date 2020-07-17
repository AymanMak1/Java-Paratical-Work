package CourHeritage;

public class LastTry {

	public static void main(String[] args) {
		RealLastTry rlt1 = new RealLastTry();
		System.out.println(rlt1.getDyali1());
		System.out.println(rlt1.getDyali2());
		RealLastTry rlt2 = new RealLastTry(4.2,"fuck");
		System.out.println(rlt2.getDyali1());
		System.out.println(rlt2.getDyali2());
		System.out.println(RealLastTry.getNbObject());
		//RealLastTry rlt3 = new RealLastTry(rlt3.setN(3.8),rlt3.setM(2),8.2,"shit");
	}

}
