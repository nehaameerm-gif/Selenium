package methodsandconstructor;

import java.util.Scanner;

public class Task1 {
//function with no return type and no parameter using scanner
	public void add() {
		Scanner scan=new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("Enter first number : ");
		num1=scan.nextInt();
		System.out.println("Enter Second number : ");
		num2=scan.nextInt();
		sum=num1+num2;
		System.out.println(sum);	
	}
	public static void main(String args[]) {
		Task1 ob=new Task1();
		ob.add();
	}
}
