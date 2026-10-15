package methodsandconstructor;

public class MethodPro {
	 public void add() {
		 int n1=20,n2=56,sum;
		 sum=n1+n2;
		 System.out.println("Sum is : "+sum);
		 
	 }
	public static void main(String args[]) {
		int num1=100,num2=500;
		
		System.out.println("Maximum value is : "+(Math.max(num1, num2)));
		
		MethodPro obj=new MethodPro();
		obj.add();
	}

}
