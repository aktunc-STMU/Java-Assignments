import java.util.Scanner;
import java.text.DecimalFormat;
public class TestPoint {
	public static void main (String []args){
		Scanner coordinate= new Scanner(System.in);
		DecimalFormat decimal= new DecimalFormat ("0.000");
		
		int x1, x2;
		int y1, y2;
		
		System.out.println ("CALCULATING DISTANCE:\n");
		
		ThePoint dist= new ThePoint();
		
		System.out.println ("First pair of coordinates (x & y): Seperate with \"Enter\" ");
		x1= coordinate.nextInt();
		y1= coordinate.nextInt();
		
		System.out.println ("Second pair of coordinates (x & y): Seperate with \"Enter\" ");
		x2= coordinate.nextInt();
		y2= coordinate.nextInt();
	
		System.out.println ("The distance between the two points is " + decimal.format(dist.distance(x1, y1, x2, y2)));
		coordinate.close();
	}
}
