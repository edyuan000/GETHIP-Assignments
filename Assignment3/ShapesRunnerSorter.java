import java.util.*;

public class ShapesRunnerSorter{
	public static void main(String[] args){
		//adding test data to array list shapes
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(new Circle(6));
		shapes.add(new Triangle(6, 4));
		shapes.add(new Rectangle(8, 3));
		shapes.add(new Rhombus(6, 5));
		shapes.add(new Trapezoid(4, 10, 5));
		//executes the bubble sort on shapes
		bubbleSort(shapes);
		//loop through each shape in shapes
		for(Shape s : shapes){
			System.out.println("Calculating " + s.getShapeName() + " area:");
			System.out.print("Area = ");
			System.out.printf("%.1f%n", s.getArea());
			System.out.println("Printing " + s.getShapeName() + " description:");
			s.printDescription();
			System.out.println("\n");
		}
	}

	private static void bubbleSort(LinkedList<Shape> s){
		//bubble sorts through array
		boolean sort = true; //sets sort to true to begin loop
		Shape temp; //holds temporary variable

		while(sort){
			sort = false;
			for(int i = 0; i < s.size() - 1; i++){
				if(s.get(i).getArea() > s.get(i+1).getArea()){
				//if front element is greater than next, switch //it to behind it until the entire list has been searched and swapped
					temp = s.get(i);
					s.set(i, s.get(i+1));
					s.set(i+1, temp);
					sort = true;
				}
			}
		}

	}
}
