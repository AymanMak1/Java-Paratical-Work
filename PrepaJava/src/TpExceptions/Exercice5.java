package TpExceptions;

import java.util.Arrays;

public class Exercice5 {

	public static void main(String[] args) {

		myIntStack stck = new myIntStack(4);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		System.out.print(Arrays.toString(stck.getContents()));
	}

}
