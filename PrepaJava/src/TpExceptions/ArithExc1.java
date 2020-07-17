package TpExceptions;
import java.util.Scanner;
public class ArithExc1 {
	double Pocket;
	public double buy(double camPrix) throws noMoneyToBuyACamera {
		if(camPrix >= Pocket ) {
			throw new noMoneyToBuyACamera();
		}
		else
		{
			return Pocket - camPrix;
			
		}

	}
	public static void main(String[] args)  {
		ArithExc1 cam = new ArithExc1();
		cam.Pocket=5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Taper le prix de camera");
		int n = sc.nextInt();
		try {
			System.out.println(cam.buy(n));
			System.out.println("You buyed it congrats");
		}catch( noMoneyToBuyACamera e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
