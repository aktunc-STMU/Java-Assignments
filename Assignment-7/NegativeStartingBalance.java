
public class NegativeStartingBalance extends Exception {
	private static final long serialVersionUID = 1L;
	public NegativeStartingBalance() {
		super ("Error: Negative starting balance");
	}
	public NegativeStartingBalance (double amount) {
		super ("Error: Negative starting balance: " + amount);
	}
}
