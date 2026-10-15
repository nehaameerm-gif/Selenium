package ControlStatements;

public class Switch {
	public static void main(String args[]) {
		String day="wed";
		switch(day) {
		case "Sun": System.out.println("SUN");//if(Wed==Sun)//false
		break;
		
		case "Mon": System.out.println("MON");//if(Wed==Mon)//false
		break;
		
		case "Tue": System.out.println("TUE");//if(Wed==Tue)//false
		break;
		
		case "Wed": System.out.println("WED");//if(Wed==Wed)//true
		break;
		
		case "Thu": System.out.println("THU");
		break;
		
		case "Fri": System.out.println("FRI");
		break;
		
		case "Sat": System.out.println("SAT");
		break;
		
		default : System.out.println("Invalid value");
		}
	}
}
