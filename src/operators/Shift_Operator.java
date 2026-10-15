package operators;

public class Shift_Operator {

	public static void main(String[] args) {
		int x=3,y=-3;
		
		System.out.println("3 binary :"+Integer.toBinaryString(x));
		System.out.println("-3 binary :"+Integer.toBinaryString(y));
		//X=3
		//left shift 
		System.out.println("Left shift x :"+(x<<2));
		System.out.println("X binary Left shift :"+Integer.toBinaryString(x));
		
		//Right shift
		System.out.println("Right shift x :"+(x>>1));
		System.out.println("X binary Right shift :"+Integer.toBinaryString(x));
		
		//Unsigned Right shift
		System.out.println("Unsigned Right shift x :"+(x>>>1));
		System.out.println("X binary Unsigned Right shift :"+Integer.toBinaryString(x));
		
		//Y=-3
		//left shift 
		System.out.println("Left shift y :"+(y<<2));
		System.out.println("y binary Left shift :"+Integer.toBinaryString(y));
				
		//Right shift
		System.out.println("Right shift y :"+(y>>1));
		System.out.println("y binary Right shift :"+Integer.toBinaryString(y));
				
		//Unsigned Right shift
		System.out.println("Unsigned Right shift y :"+(y>>>1));
		System.out.println("y binary Unsigned Right shift :"+Integer.toBinaryString(y));
	}

}
