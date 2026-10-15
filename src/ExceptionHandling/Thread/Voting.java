package ExceptionHandling.Thread;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) throws AgeLimitException {
		// TODO Auto-generated method stub
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age=scan.nextInt();
		try {
			if(age<18) {
				throw new AgeLimitException ("below 18 is not eligible for vote");
			}
			else {
				System.out.println("Eligible for vote ");
			}
		}
			catch (AgeLimitException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
			System.out.println("Welcome");

	}

}
