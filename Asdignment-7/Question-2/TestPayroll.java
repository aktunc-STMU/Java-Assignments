import java.lang.Exception;

public class TestPayroll {
	public static void main (String [] args){
		try{
			Payroll worker = new Payroll ("", 123);
		} catch (Exception e)
		{
			System.out.println("Error - " + e.getMessage());
		}

	}
}