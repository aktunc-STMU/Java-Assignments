
public class AccountTest {

	public static void main(String[] args) {
		// Force a NegativeStartingBalance exception.
		try
		{
			BankAccount account = new BankAccount(-100.0);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}