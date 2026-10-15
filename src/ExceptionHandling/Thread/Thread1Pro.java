package ExceptionHandling.Thread;

public class Thread1Pro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String threadname = Thread.currentThread().getName(); 
		System.out.println("Current thread name : "+threadname);

		//Display
		System.out.println("Display Current thread : "+Thread.currentThread());
		
		//Change Thread name
		Thread t =new Thread();
		t.setName("New Thread");
		System.out.println(t);
		
		//Delay
		for(int i=1;i<5;i++) {
		Thread.sleep(1000);
		System.out.println(i);
		}
	}

}
