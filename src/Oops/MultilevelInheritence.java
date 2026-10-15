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
class PuPpy extends DoG{
	int age=1;
	
	public void play() {
		System.out.println("Puppy is playing");
	}
}


public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PuPpy ob=new PuPpy();
	    System.out.println("Breed = "+(ob.breed));
	    System.out.println("Color = "+(ob.Color = "Black"));
	    System.out.println("age = "+(ob.age));
		ob.bark();
		ob.eat();
		ob.play();
		

	}

}
