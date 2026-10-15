package methodsandconstructor;

import java.util.Scanner;

public class Task2 {
	//function with return type and parameter
	public int add(int num1,int num2) {
		int sum;
		return sum=num1+num2;	
	}
	public static void main(String args[]) {
	Task2 ob=new Task2();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number : ");
	int num1=scan.nextInt();
	System.out.println("Enter second number : ");
	int num2=scan.nextInt();
	System.out.println(ob.add(num1, num2));
	}

}
