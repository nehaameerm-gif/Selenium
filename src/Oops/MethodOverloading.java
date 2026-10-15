package Oops;

public class MethodOverloading {
	public static void add() {
		int num1=10, num2=20;
		System.out.println("Sum ="+(num1+num2));
		
	}
	public static void add(int num1,float num2) {
		float sum = num1+num2;
		System.out.println("Sum ="+(num1+num2));
		
	}
	public static void add(float num1,int num2) {
		float sum = num1+num2;
		System.out.println("Sum ="+(num1+num2));
		
	}
	public static void add(float num1,int num2,int num3) {
		float sum = num1+num2+num3;
		System.out.println("Sum ="+(num1+num2+num3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(4.5f, 10);
		add(20, 2.4f);
		add(2.3f, 2, 18);

	}

}