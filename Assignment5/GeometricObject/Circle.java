
public class Circle extends GeometricObject{
	double radius;
	
	
	public Circle(String cColor, double radius) {
		super();
		setColor(cColor);
		this.radius = radius;
	}
	public String cColor (String cColor){
		return cColor;
	}
	public double cArea(){
		double cArea= Math.pow(radius, 2)*1;
		return cArea;
	}
	public double cPerimeter(){
		double cPerimeter= Math.PI*(2*radius);
		return cPerimeter;
	}

}
