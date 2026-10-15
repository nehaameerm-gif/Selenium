package ExceptionHandling.Thread;

public class TrywithmultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
 		int a=10;
		int arr[]=null;
        try {
     	System.out.println(arr[1]);//Null pointer Exception
			System.out.println(a/0);//arithmetic exception	
		}
		catch (ArithmeticException e1) {
			// TODO: handle exception
		  System.out.println(e1);
		}
        catch (IndexOutOfBoundsException e2) {
			// TODO: handle exception
        	System.out.println(e2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Welcome");

	

	}

}
