package Oops;

//public class StdInfo extends StdDetails{
public class StdInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StdInfo ob=new StdInfo();
		StdDetails ob=new StdDetails();
	    ob.setValues("abc@gmail.com", "abc123");
		System.out.println(ob.getEmailid());
		System.out.println(ob.getPswd());
		

	}

}
