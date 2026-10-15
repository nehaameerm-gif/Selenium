package Oops;
class BirDs {
	public void sound() {
		System.out.println("Tweet...Tweet..");
	}
}
class DuCk extends BirDs{
	public void sound() {
	System.out.println("Quack..Quack..");	
	}
}
public class MethodOveriding {
	public static void main(String args[]) {
        DuCk d =new DuCk();
//		BirDs d= new DuCk(); //Dynamic binding
		d.sound();
	}

}
