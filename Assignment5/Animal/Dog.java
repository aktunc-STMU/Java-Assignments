
public class Dog extends Animal{
	int height ;
	String name;
	
	public Dog(String breed,  int age, String name, int height) {
		super(breed, age);
		this.name= name;
		this.height= height;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setHeight(int height) {
		this.height= height;
	}
	public void makeNoise() {
		System.out.println("Woof!");
	}
	public void jump() {
		System.out.println("*boing, woof, boing!*");
	}
}
