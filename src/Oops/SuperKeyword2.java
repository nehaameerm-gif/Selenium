package Oops;
class SuperClass1{
	public void display() {
	String name="Anu";
	System.out.println(name);
}
}
public class SuperKeyWord1extends SuperClass1{
	public void display() {
		String name="Anupama";
		super.display();
		System.out.println(name);
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyWord obj=new SuperKeyWord();
		obj.display();
		

	}

}
