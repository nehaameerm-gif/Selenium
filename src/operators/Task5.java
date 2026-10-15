package operators;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		int x,y,z,eqn;
	      Scanner pblm =new Scanner(System.in);
		  System.out.println("Enter x : ");
		  x=pblm.nextInt();
		  System.out.println("Enter y : ");
		  y=pblm.nextInt();
		  System.out.println("Enter z : ");
		  z=pblm.nextInt();
		  
		eqn=z/x+y*x-(y+x)%z;
		System.out.println("Answer is : "+eqn);
	}

}
