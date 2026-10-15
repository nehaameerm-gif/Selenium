package ControlStatements;

public class Nested_If{
	public static void main(String args[]) {
		int num = -25;
		if(num>0) {
			if(num%2==0) {
				System.out.println(num+" is positive and even number");
			}
			else {
				System.out.println(num+ " is positive and odd number");
			}
		}
		else {
			if(num%2==0) {
				System.out.println(num+" is negative and Even number");
			}
			else {
				System.out.println(num+" is negative and odd number");
			}
		}
	}

}