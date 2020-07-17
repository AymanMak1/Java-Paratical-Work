package TpExceptions;

public class ArithExc {
	int n; double p ;
	
	public double m(int n) throws Exception  {
		if( n == 0) throw new ArithmeticException("Erreur !");	
		return 1.0/n;
	}
	
	public static void main(String[] args) throws Exception {
		try {
			int n=Integer.parseInt(args[0]);
			ArithExc a = new ArithExc();
			System.out.println(a.m(n));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}

