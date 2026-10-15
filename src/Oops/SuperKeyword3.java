package Oops;
class SuperClass{
	public SuperClass() {
		String name="Anu";
		System.out.println(name);
	}
	public SuperClass(String name) {
		System.out.println(name);
	}
}
public class SuperKeyword3 extends SuperClass{
	public SuperKeyword3() {
		super("Arun");
		String name="Anupama";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword3 obj=new SuperKeyword3();
		obj.

	}

}
