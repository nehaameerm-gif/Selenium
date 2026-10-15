package Classwork;

import java.util.Scanner;

public class CS6 {
	public static void main(String args[]) {
	 Scanner scan = new Scanner(System.in);

	 System.out.print("Input the 1st number: ");
	 int a = scan.nextInt();

	 System.out.print("Input the 2nd number: ");
	 int b = scan.nextInt();

	  System.out.print("Input the 3rd number: ");
	  int c = scan.nextInt();	
	  

      if (a > b && a > c) {
          System.out.println("The greatest: " + a);
      }
      else if (b > a && b > c) {
          System.out.println("The greatest: " + b);
      }
      else {
          System.out.println("The greatest: " + c);
      }
	}

}
