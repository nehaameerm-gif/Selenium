package operators;

public class UnaryOperator {
	public static void main(String args[]) {
		
		//unary minus
		int n=100;
		n=-n;
		System.out.println(n);
		
		//not operator
		boolean value=false;
		System.out.println(!value);
		
		//increment
		//post increment
		int a=10;
		a++;
		System.out.println(a);
		
		//pre increment
		++a;
		System.out.println(a);
		
		//decrement operator
		
		//post decrement
				int b=18;
				b--;
				System.out.println(b);
		//pre decrement
				--b;
				System.out.println(b);
				
		//bitwise compliment
				System.out.println(~a);
	}

}
