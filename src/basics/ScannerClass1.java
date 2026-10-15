package basics;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String args[]) {
		String name;
		int age;
		String gender;
		String Dob;
		String address;
		long phno;
		String emailid;
		String quali;
		float totalmark;
		String grade;
		String course;
		Short installment;
		int totalamnt;
		String institution;
		boolean joining;
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name :");
			//name=scan.next();
			name=scan.nextLine();
			System.out.println(name);
			
			System.out.println("Enter your age :");
			age=scan.nextInt();
			System.out.println(age);
			
			System.out.println("Enter your gender :");
			gender=scan.next();
			System.out.println(gender);
			
			System.out.println("Enter your date of birth :");
			Dob=scan.next();
			System.out.println(Dob);
			
			System.out.println("Enter your address :");
			address=scan.next();
			System.out.println(address);
			
			System.out.println("Enter your Phone number :");
			phno=scan.nextLong();
			System.out.println(phno);
			
			System.out.println("Enter your email id :");
			emailid=scan.next();
			System.out.println(emailid);
			
			System.out.println("Enter your Qualification :");
			quali=scan.next();
			System.out.println(quali);
			
			System.out.println("Enter your total mark :");
			totalmark=scan.nextFloat();
			System.out.println(totalmark);
			
			System.out.println("Enter your grade :");
			grade=scan.next();
			System.out.println(grade);
			
			System.out.println("Enter your course :");
			course=scan.next();
			System.out.println(course);
			
			System.out.println("Enter your installment :");
			installment=scan.nextShort();
			System.out.println(installment);
			
			System.out.println("Enter your total amount:");
			totalamnt=scan.nextInt();
			System.out.println(totalamnt);
			
			System.out.println("Enter your  Institution:");
			institution=scan.next();
			System.out.println(institution);
			
			System.out.println("Enter your  Joining:");
			joining=scan.nextBoolean();
			System.out.println(joining);
		
			
	}

}
