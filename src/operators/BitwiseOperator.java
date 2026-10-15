package operators;

public class BitwiseOperator {
	public static void main(String args[]){
		int n1=15,n2=16;
	System.out.println("n1 = 15 :" +Integer.toBinaryString(n1));
	System.out.println("n2 = 16 :" +Integer.toBinaryString(n2));
	
	//Bitwise or
	System.out.println("n1|n2 :"+(n1|n2));
	System.out.println("n1|n2 in binary:"+Integer.toBinaryString(n1|n2));
	
	//Bitwise and
	System.out.println("n1&n2 :"+(n1&n2));
	System.out.println("n1&n2 in binary:"+Integer.toBinaryString(n1&n2));
		
	//Bitwise XOR
	System.out.println("n1^n2 :"+(n1|n2));
	System.out.println("n1^n2 in binary:"+Integer.toBinaryString(n1^n2));
	
	//Bitwise compliment
	System.out.println("~n1 :"+(~n1));
	System.out.println("~n1 in binary:"+Integer.toBinaryString(~n1));
	
	System.out.println("~n2 :"+(~n2));
	System.out.println("~n2 in binary:"+Integer.toBinaryString(~n2));
		
	}

}
