public class Rectangle extends Shape implements Printable{
	private int width;
	private int height;

	//Constructs rectangle with a width and height
	public Rectangle(int h, int w){
		setShapeType("Quadrilateral");
		setShapeName("Rectangle");
		this.height = h;
		this.width = w;
	}
	
	//gets area of rectangle by multiplying base and height
	@Override
	public double getArea(){
		return width*height;
	}

	//prints description with area and features
	@Override
	public void printDescription(){
		super.printDescription();
		System.out.println("Height is " + height + " units.");
		System.out.println("Width is " + width + " units.");
	}

}
