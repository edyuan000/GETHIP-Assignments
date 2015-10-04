public class Trapezoid extends Shape implements Printable{
	private int baseA;
	private int baseB;
	private int height;

	public Trapezoid(int bA, int bB, int h){
		this.baseA = bA;
		this.baseB = bB;
		this.height = h;
		setShapeType("Quadrilateral");
		setShapeName("Trapezoid");
	}

	//gets area by multiplying bases and height, dividing by 2
	@Override
	public double getArea(){
		return ((baseA + baseB) / 2) * height;
	}

	//prints description of trapezoid
	@Override
	public void printDescription(){
		super.printDescription();
		System.out.println("Base A is " + baseA + " units.");
		System.out.println("Base B is " + baseB + " units.");
		System.out.println("Height is " + height + " units.");
	}
}
