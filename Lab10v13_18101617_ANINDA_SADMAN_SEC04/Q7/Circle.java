package Q7;

public class Circle implements GeometricObject{
	protected double radius=1.0;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getParameter(){
		return 2*Math.PI*radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
}
