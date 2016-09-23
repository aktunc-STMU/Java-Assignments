//import java.util.Scanner;
public class TestAnimal {
	public static void main (String[]args){
		Dog d = new Dog ("Dalmatian", 1, "Spots", 2);
		Cat c = new Cat ("Birman", 3, "Fluffy", "White & Black");
		
		System.out.println("Our puppy's name is " + d.getName() + ".");
		System.out.println("he is a " + d.getBreed());
		System.out.println("he is " +  d.getAge() + " years old");
		System.out.println("and measures " +d.getHeight() + " feet.\n\n");
		
		d.makeNoise();
		d.jump();
		
		System.out.println("\nWe also have a small Cat named "+ c.getName());
		System.out.println("she is a " + c.getBreed());
		System.out.println("She is " +c.getAge()+ " years old");
		System.out.println("and has beautiful " +c.getColor() +" fur.\n\n");
	
		c.makeNoise();
		c.jump();
	}
}
