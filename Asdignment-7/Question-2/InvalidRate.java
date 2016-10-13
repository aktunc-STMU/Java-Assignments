
public class InvalidRate extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidRate() {
		super("Error: Negative pay rate");
	}
	public InvalidRate (double payRate) {
		if (payRate<0)
			System.out.println("Error: Negative pay rate: " + payRate);
		else
			System.out.println("Error: Pay rate is over max of $25: " + payRate);
	}
}
