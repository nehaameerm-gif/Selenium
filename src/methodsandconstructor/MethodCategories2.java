package methodsandconstructor;

public class MethodCategories2 {
	//2.Function with no return type and with parameter
		public void areaOfRectangle(float l,float b) {
			float area;
			area=l*b;
			System.out.println("Area of rectangle : "+area);
			
		}
		public static void main(String args[]) {
			MethodCategories2 obj=new MethodCategories2();
			obj.areaOfRectangle(3.3f,2.2f);
		

}
}