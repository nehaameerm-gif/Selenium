package Oops;
class LapTop{
	String Color;
	public void version() {
		System.out.println("Version is windows");
	}
}
class HP extends LapTop{
	int price;
	public void core() {
		System.out.println("Intel core is 5");
	}
	
}
class Lenova extends LapTop{
	String Warrenty;
	public void Graphics() {
		System.out.println("Graphics card is available");
	}
}

public class Hierarchical_Inheritence {
	public static void main(String args[]) {
	HP ob=new HP();
    System.out.println("");

}

}
