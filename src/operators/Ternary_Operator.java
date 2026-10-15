package operators;

public class Ternary_Operator {
	public static void main(String args[]) {
		int n1=29,n2=40;
		int res = (n1<=n2)?(n1+n2):(n1-n2);
		System.out.println(res);
		
		//positive or negative
		
		int a=-40,b=50;
		String rslt = (a>0)?"positive":"negative";
		System.out.println(rslt);
		
		
		//even or odd
		int a1=25,b2=5;
		String rslt1 =(a1%5==0)?"Even":"odd";
		System.out.println(rslt1);
		
		
	}

}
