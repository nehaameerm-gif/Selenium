package operators;

public class TypeCasting {
	public static void main (String args[]) {
		char val='N';
		int num=val;
		float deci=num;
		System.out.println("---WIDENING TYPE CASTING---");
		System.out.println("val = "+val+"    \tnum = "+num+"   \tdeci = "+deci);
				
		float dec=65.0f;
		int num1=(int) dec;
		char valu=(char) num1;
		System.out.println("---NARROWING TYPE CASTING---");
		System.out.println("dec = "+dec+"    \tnum1 = "+num1+"   \tvalu = "+valu);
		
		
		
	}

}
