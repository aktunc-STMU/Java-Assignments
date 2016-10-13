
public class NegativeInterestRate extends Exception {
	private static final long serialVersionUID = 1L;

	public NegativeInterestRate() {
		super("Error: Negative interest rate");
	}

	public NegativeInterestRate (double amount) {
		super("Error: Negative interest rate: " + amount);
	}
}
