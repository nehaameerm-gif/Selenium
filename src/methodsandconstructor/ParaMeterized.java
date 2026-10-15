package methodsandconstructor;

public class ParaMeterized {
	float area;
	public ParaMeterized(float l,float b) {
		area=l*b;
		System.out.println("Area : "+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaMeterized obj=new ParaMeterized(1.4f,2.2f); 

	}

}
