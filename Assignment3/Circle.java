import java.util.*;

public class Circle extends Shape implements Printable{
	
	private int radius;
	
	//constructs circle and sets the name and type
	public Circle(int radius){
		this.radius = radius;
		setShapeName("Circle");
		setShapeType("Circle");
	}
	//returns the area of circle
	@Override
	public double getArea(){
		return Math.PI*Math.pow(radius,2);
	}

	//prints description for circle
	@Override
	public void printDescription(){
		super.printDescription();
		System.out.println("Radius is " + radius + " units.");
	}
}
