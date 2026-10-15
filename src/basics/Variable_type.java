package basics;

public class Variable_type {
	
	//local variable
	public void add() {//method
		int num1=10,num2=20,sum;
		sum = num1+num2;
		System.out.println(sum);
	}
	public static void main(String args[]) {
		Variable_type obj = new Variable_type();
		obj.add();
	}

}
