public abstract class Shape implements Printable{
	private String shapeType;
	private String shapeName;
	
	//gets shape type and returns it
	public String getShapeType(){
		return shapeType;
	}
	
	//allows user to set the type
	public void setShapeType(String type){
		this.shapeType = type;
	}
	
	//gets and returns the shape name
	public String getShapeName(){
		return shapeName;
	}
	
	//allows user to set shape name
	public void setShapeName(String name){
		this.shapeName = name;
	}
	

	public void printDescription(){
		System.out.println("Type is " + shapeType);
	}

	public abstract double getArea();
}
