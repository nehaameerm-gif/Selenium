package Oops;
//change name without using this keyword
public class Change_name {
	String name;
	int rno;
	float fee;
	
	public Change_name(String Fullname,int rollno,float fees) {
		name=Fullname;
		rno=rollno;
		fee=fees;
	}
	
	public void display() {
	System.out.println("Name = "+name);
	System.out.println("Roll number = "+rno);
	System.out.println("Total fees = "+fee);
	}
	
	public static void main(String args[]) {
		Change_name ob =new Change_name("Anu",2,15000.5f);
		ob.display();
		
 }

}
