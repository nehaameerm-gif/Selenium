package Oops;
//usage-Instance variable
class SuperClass{
	String name="Anu";
}
class SuperKeyword extends SuperClass{
	String name="Anupama";

public void display() {
  System.out.println(super.name);
  System.out.println(name);
}
}
public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword obj=new SuperKeyword();
		obj.display();

	}

}
