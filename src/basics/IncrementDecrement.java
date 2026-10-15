package basics;

public class IncrementDecrement {

	public static void main(String[] args) {
	   int n1=10;
	   //increment
	   int val=n1++;
	   System.out.println(val+"\t"+n1);
	   
	   int val2=++n1;
	   System.out.println(val2+"\t"+n1);
	   
	   //Decrement
	   int val3=n1--;
	   System.out.println(val3+"\t"+n1);
	   
	   int val4=--n1;
	   System.out.println(val4+"\t"+n1);
	}

}
