package ControlStatements;

public class Nested_switch {
	public static void main(String args[]) {
		int school=2;
		char department='a';
		switch (school) {
		case 1:System.out.println("School of computer science");
		     switch(department) {
		     case 'a':System.out.println("Department of informatics");
		     break;
		     case 'b':System.out.println("Department of Machine learning");
		     break;
		     }
	   break;
		case 2:System.out.println("School of Business");
	     switch(department) {
	     case 'a':System.out.println("Department of commerce");
	     break;
	     case 'b':System.out.println("Department of purchasing");
	     break;
	     }
       break;
		case 3:System.out.println("School of Engineering");
	     switch(department) {
	     case 'a':System.out.println("Department of mechanical engineering");
	     break;
	     case 'b':System.out.println("Department of electronical engineering");
	     break;
	     }
  break;
    default:System.out.println("invalid option");
	}
		
		
		
}
}