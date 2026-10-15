package methodsandconstructor;

public class MethodCategories3 {
	//function with return type and parameter
	public float areaOfRectangle(float l,float b) {
		float area;
		return area=l*b;
		
	}
	public static void main(String args[]) {
		MethodCategories3 obj=new MethodCategories3();
		float area =obj.areaOfRectangle(3.3f,2.2f);
		System.out.println(area);
		//other way
//		System.out.println(obj.areaOfRectangle(3.3f, 2.2f));
		
	}

}
