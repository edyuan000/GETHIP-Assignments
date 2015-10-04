public class Rhombus extends Shape implements Printable{
	private int diagonalA;
	private int diagonalB;

	//Constructs rhombus, assigns values for diagonals
	public Rhombus(int dA, int dB){
		this.diagonalA = dA;
		this.diagonalB = dB;

		setShapeType("Quadrilateral");
		setShapeName("Rhombus");
	}

	//gets area by multiplying diagonals and dividing by 2
	@Override
	public double getArea(){
		return (diagonalA*diagonalB)/2;
	}

	//prints description and prints diagonal values
	@Override
	public void printDescription(){
		super.printDescription();
		System.out.println("Diagonal A is " + diagonalA + " units.");
		System.out.println("Diagonal B is " + diagonalB + " units.");
	}
}
