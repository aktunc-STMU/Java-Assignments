
public class InvalidHoursNumber extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidHoursNumber() {
		super("Error: Negative hours");
	}
	public InvalidHoursNumber (double hours) {
		if (hours<0)
			System.out.println ("Error: Negative hours: " + hours);
		else
			System.out.println("Error: Hours worked is over max of 84: " + hours);
	}
}
