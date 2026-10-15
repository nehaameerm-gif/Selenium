package basics;

public class Instancestatic {
	String name; // instance variable
	static String course = "Testing"; // static variable
	public static void main (String args[]) {
		int mark;
		Instancestatic stud1 = new Instancestatic();
		System.out.println("Name ="+(stud1.name = "Aswajith"));
		System.out.println("Course = "+course);
		System.out.println("Marks = " +(mark = 15));
		
		Instancestatic stud2 = new Instancestatic();
		System.out.println("Name ="+(stud2.name = "Anu"));
		System.out.println("Course = "+course);
		System.out.println("Marks = " +(mark = 12));
		
		Instancestatic stud3 = new Instancestatic();
		System.out.println("Name ="+(stud3.name = "Neha"));
		System.out.println("Course = "+(course = "developer"));
		System.out.println("Marks = " +(mark = 15));
		
		Instancestatic stud4 = new Instancestatic();
		System.out.println("Name ="+(stud4.name = "ansila"));
		System.out.println("Course = "+course);
		System.out.println("Marks = " +(mark = 15));         
		
		
	}
	

}