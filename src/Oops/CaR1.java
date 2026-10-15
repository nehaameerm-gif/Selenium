package Oops;

public class CaR1 implements VEHicle1{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		VEHicle1 v=new CaR1();
		v.start();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Self start");
		
	}

}
