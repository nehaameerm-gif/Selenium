package methodsandconstructor;

	//default constructor type
	public class RectanGle{
		float l,b;
		float area;
	
	
	public RectanGle() {
		l=2.5f;
		b=2.6f;
		area=l*b;
		System.out.println("Area : "+area);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectanGle ob=new RectanGle();
		

	}

}
