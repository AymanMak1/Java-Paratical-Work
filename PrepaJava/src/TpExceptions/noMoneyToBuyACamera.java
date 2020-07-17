package TpExceptions;

public class noMoneyToBuyACamera extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public noMoneyToBuyACamera() {
		super("You cannot buy a camera cuz you have no money");
		
	}

}
