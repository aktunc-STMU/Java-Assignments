import java.util.Scanner;

public class TestGeometricObject {
	public static void main (String []args){
		Scanner scan= new Scanner(System.in);
		double radius;
		double length;
		double width;
		String color;
		
		System.out.println("What is the radius of the circle?");
		radius= scan.nextDouble();
		System.out.println("What is the circle's color?");
		color= scan.next();
		Circle c= new Circle(color, radius);
		
		System.out.println("What is the length of the rectangle?");
		length= scan.nextDouble();
		System.out.println("What is the width of the rectangle?");
		width= scan.nextDouble();
		System.out.println("What is the rectangle's color");
		color= scan.next();
		Rectangle r= new Rectangle(color, length, width);
		
		System.out.println("Are the shape's areas equal? " + c.compareArea( c.cArea(), r.rArea() ));
		System.out.println("Are the shape's perimeters equal? " + c.comparePerimeter( c.cPerimeter(), r.rPerimeter() ));
		//System.out.println("Are the shapes the same color? " + c.compareColor(cColor(), rColor()));
		
		scan.close();
	}
}
