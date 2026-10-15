package Oops;

public class Without_This {
	//instance variable
	String name;
	int rno;
	float fee;
	
	public Without_This(String name,int rno,float fee) {
		name=name;
		rno=rno;
		fee=fee;
	}
	
	public void display() {
	System.out.println("Name = "+name);
	System.out.println("Roll number = "+rno);
	System.out.println("Total fees = "+fee);
	}
	
	public static void main(String args[]) {
		Without_This ob=new Without_This("Anu",2,15000.5f);
		ob.display();
		
 }

}
