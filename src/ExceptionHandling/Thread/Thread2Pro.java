package ExceptionHandling.Thread;
	class ThreadNew extends Thread{
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("New Thread");
				try {
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {
					// TODO: handle exception
				//	e.printStackTrace();
					System.out.println(e);
				}
				
			}
		}
	}
public class Thread2Pro {
	public static void main(String args[]) throws InterruptedException {
		ThreadNew ob=new ThreadNew();
		ob.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread");
			Thread.sleep(2000);
		}
	}

}
