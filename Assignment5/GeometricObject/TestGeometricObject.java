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

/*I know we only had to compare the Area but I wanted to compare all the  characteristic of the Objects
On line 27 i wanted to compare the color with out cby calling out the method from the GeometricObjectclass but i dont know if the method i reading the color fromt the sub classes (Rectangle & Circle) because it does not allow me to cal them out like i had in the previous two comparisons. I know I could have created two variables in this class (ex: String circleColor; and String rectangleColor) and then have written compareColor(circleColor, rectangleColor); but that woudl have not used the variables for color in the other classes. How could i have written this?? */
