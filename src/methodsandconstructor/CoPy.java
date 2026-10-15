package methodsandconstructor;

public class CoPy {
	float area;
	public CoPy(float l,float b) {
		area=l*b;
	}
	public void display() {
		System.out.println("Area : "+area);
	}
	public static void main(String args[]) {
		CoPy ob=new CoPy(1.4f,2.2f);
		ob.display();
		CoPy ob1=ob;//copy constructor
	    ob1.display();
		
	}

}
