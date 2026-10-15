package methodsandconstructor;

public class MethodCategories1 {
	//1.Function with no return type and no parameter
	public void areaOfRectangle() {
		float l=2.2f,b=3.2f,area;
		area=l*b;
		System.out.println("Area of rectangle : "+area);
		
	}
	public static void main(String args[]) {
		MethodCategories1 obj=new MethodCategories1();
		obj.areaOfRectangle();
		
	}
}
