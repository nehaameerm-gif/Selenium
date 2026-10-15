package Oops;
class FinalClass{
  public final void display() {
	  System.out.println("Hellooo.....");
  }
}
public class FinalMethod extends FinalClass {
	public void display1() {
		System.out.println("Java programming.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FinalMethod ob =new FinalMethod();
     ob.display();
     ob.display1();
	}

}
