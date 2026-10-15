package Oops;

public class ThisKeyword {
	//instance variable
	String name;
	int rno;
	float fee;
	
	public ThisKeyword(String name,int rno,float fee) {
		this.name=name;
		this.rno=rno;
		this.fee=fee;
	}
	
	public void display() {
	System.out.println("Name = "+name);
	System.out.println("Roll number = "+rno);
	System.out.println("Total fees = "+fee);
	}
	
	public static void main(String args[]) {
		ThisKeyword ob =new ThisKeyword("Anu",2,15000.5f);
		ob.display();
		
 }

}
