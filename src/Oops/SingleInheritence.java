package Oops;
class AniMal{
	String Color;
	public void eat() {
		System.out.println("Animal is eating...");
	}
}
class DoG extends AniMal{
	String breed="Pug";
	
	public void bark() {
		System.out.println("Dog is barking...");
	}
	
}
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoG ob=new DoG();
	    System.out.println("Breed = "+(ob.breed));
	    System.out.println("Color = "+(ob.Color = "Black"));
		ob.bark();
		ob.eat();

	}

}
