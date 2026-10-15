package Tasks;

public class Task7 {
	public static void main(String args[]) {
		int a=10,b=5,c=8;
		if(a<b && a<c) {
			System.out.println("Smallest a = " +a);
		}
		else if(b<a && b<c) {
			System.out.println("Smallest b = "+b);
		}
		else {
			System.out.println("Smallest c = " +c);
		}
	}

}