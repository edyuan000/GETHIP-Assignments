public class Triangle extends Shape implements Printable{
	private int base;
	private int height;
	
	//Constructs triangle with base and height
	public Triangle(int b, int h){
		this.base = b;
		this.height = h;
		setShapeName("Triangle");
		setShapeType("Triangle");
	}

	//overrides area method and returns area
	@Override
	public double getArea(){
		return (base*height)/2;
	}

	//overrides print description
	@Override
	public void printDescription(){
		super.printDescription();
		System.out.println("Base is " + base + " units.");
		System.out.println("Height is " + height + " units.");
	}
}

