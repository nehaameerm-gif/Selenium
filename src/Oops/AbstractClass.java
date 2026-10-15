package Oops;

abstract class VehicLE{
	public abstract void start();//abstract method
	public void sound() {//non abstract method/concrete method
		System.out.println("Beep...Beep");	
	}
}
class BIke extends VehicLE{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
class TRain extends VehicLE{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button start");
		
	}
	
}

public class AbstractClass {
	public static void main(String args[]) {
		BIke b =new BIke();
		b.start();
		b.sound();
		
		VehicLE v =new TRain();//up-casting
		v.start();
		v.sound();
		
	}
}
