package operators;

public class Task6 {
	public static void main(String args[]) {
		int a=35 ,b=50;
		boolean A=a==b;//false
		boolean B=a<=b;//true
		
        System.out.println(" A = "+A+"\tB = "+B);
        
	    //OR
		
	    System.out.println("logical OR : A||B = "+(A||B));
	    System.out.println("logical OR : (A||B) && (A||B) = "+((A||B)&&(A||B)));
	    System.out.println("logical OR : !(A||B)&&(A||B) = "+(!(A||B)&&(A||B)));
	    

	    
	    //AND
	    
	   System.out.println("logical AND : A&&B ="+(A&&B));
	   System.out.println("logical AND : (A&&B)||(A&&B) = "+((A&&B)||(A&&B)));
	   System.out.println("logical OR : !(A&&B)||(A&&B) = "+(!(A&&B)||(A&&B)));
	}

}
