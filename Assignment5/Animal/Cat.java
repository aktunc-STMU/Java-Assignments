
public class Cat extends Animal{
	String color;
	String name;
	
	public Cat(String breed,  int age, String name, String color) {
		super(breed, age);
		this.color= color;
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setColor(String color) {
		this.color= color;
	}
	public void makeNoise() {
		System.out.println("Meow!");
	}
	public void jump() {
		System.out.println("*boing, boing!*");
	}
}
