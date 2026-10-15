package ExceptionHandling.Thread;

public class TryFinaly {
	public static void main(String args[]) {
		int a=10;
		try {
			System.out.println(a/0);
		}
		finally {
			System.out.println("Welcome");//first prints
		}
	}

}
