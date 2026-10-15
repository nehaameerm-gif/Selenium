package Classwork;

public class CS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Task 1
				int num=62;
				if(num>100) {
					System.out.println(num+" Greater than 100");
				}
				else if(num<100) {
					System.out.println(num+" Less than 100");
					
				}
				else if(num==10){
					System.out.println(num+" equal to 100");
					
				}
				
				//Task2
				System.out.println("----------");

				int age = 12;
		        double weight = 50;

		        if (age >= 18 && weight >= 50) {
		            System.out.println("Eligible to donate blood");
		        } else {
		            System.out.println("Not eligible");
			
		       }
		        //Task3
		        System.out.println("----------");
		        int x =30,y=10;
				if(x==30) {
					if(y==10) {
						System.out.println("x = 30 and y = 10");

					}
			
				}
				//task4
				System.out.println("----------");
				int mark = 85;

		        if (mark > 90) {
		            System.out.println("Grade A");
		        } else if (mark >= 70 && mark <= 89) {
		            System.out.println("Grade B");
		        } else if (mark >= 50 && mark <= 69) {
		            System.out.println("Grade C");
		        } else {
		            System.out.println("Grade D");
		        }
				//Task 5
		        System.out.println("----------");
		        int i=20;
				if(i==10) {
					System.out.println("i is 10");
				}
				else if(i==15) {
					System.out.println("i is 15");
				}
				else if(i==20) {
					System.out.println("i is 20");
				}
				else {
				System.out.println("i is not present");
			}
				
				//Task6
				System.out.println("----------");
				int number = 100;

		        if (number > 100) {
		            System.out.println("Greater than 100");
		        } else if (number < 100) {
		            System.out.println("Less than 100");
		        } else {
		            System.out.println("Equal to 100");
		        }
		        //Task7
		        System.out.println("----------");
		        int a=10,b=5,c=8;
				if(a<b && a<c) {
					System.out.println("Smallest a = " +a);
				}
				else if(b<a && b<c) {
					System.out.println("Smallest b = "+b);
				}
				else {
					System.out.println("Smallest c = " +c);
				}
				
				//Task8
				System.out.println("----------");
				
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


