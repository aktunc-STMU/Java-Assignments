
public class InvalidIDNumber extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidIDNumber() {
		super("Error: Negative ID number");
	}
	public InvalidIDNumber (int idNumber) {
		super("Error: Negative ID number " + idNumber);
	}
}
