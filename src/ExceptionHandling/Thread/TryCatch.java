package ExceptionHandling.Thread;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a/0);//arithmetic exception	
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Welcome");

	}

}
