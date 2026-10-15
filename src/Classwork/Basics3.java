package Classwork;

public class Basics3 {
	public static void main(String args[]) {
		//using third variable
		int m=9,n=5;
		int x=m;
		m=n;
		n=x;
		System.out.println("m =   "+m);
		System.out.println("n =  "+n);
		
		//without using third variable
		m = m + n;
		n = m - n;
		m = m - n;

		System.out.println("m =  " + m);
		System.out.println("n =  " + n);
		
		
	}

}
