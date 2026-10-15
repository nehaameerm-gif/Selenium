package operators;

public class Logical_operators {
	public static void main(String args[]) {
		int n1=30,n2=45;
		
		boolean A=n1==n2;
		boolean B=n1<=n2;
		
		System.out.println("A = "+A+"\tB = "+B);
		
		//logical not
		System.out.println("!A = "+(!A)+"\t!B = "+(!B));
		
		//logical AND&&
        System.out.println("logical AND : A&&B = "+(A&&B));
		
		
		System.out.println("logical OR : A||B "+(A||B));
	}

}
