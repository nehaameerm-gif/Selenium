package Oops;
public class StdDetails {
	//variables
	private String emailid;
	private String pswd;
	//methods
//	
//	public void setEmailid(String emailid){
//		this.emailid=emailid;
//	}
//	public void setPswd(String pswd){
//		this.pswd=pswd;
//	}
public void setValues(String emailid,String pswd) {
	this.emailid=emailid;
	this.pswd=pswd;
}
public String getEmailid() {
	return emailid;
}
public String getPswd() {
	return pswd;
}
}


