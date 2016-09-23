
public class Rectangle extends GeometricObject{
	double length;
	double width;
		
	public Rectangle(String rColor, double length, double width) {
		super();
		setColor(rColor);
		this.length = length;
		this.width= width;
	}
	public String rColor (String rColor){
		return rColor;
	}
	public double rArea(){
		double rArea= length*width;
		return rArea;
	}
	public double rPerimeter(){
		double rPerimeter= (2*length)+(2*width);
		return rPerimeter;
	}

}
