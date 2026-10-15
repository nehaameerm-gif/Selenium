package ExceptionHandling.Thread;

public class Work1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a = 10;
			int arr[]=null;
			
			
			
			try {
				System.out.println(arr[1]);
				System.out.println(a/0);
				
			}
			
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
			finally {
			System.out.println("helloo");
	       }
		}
	}

