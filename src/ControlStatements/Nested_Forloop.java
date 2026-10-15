package ControlStatements;

public class Nested_Forloop {
	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");//i
			}
			System.out.println();
/*output- 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 */
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");//j
			}
			System.out.println();
	}/*1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 */


	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");//*
		}
		System.out.println();
	}/*
*
**
***
****
*****
*/
	
	
	
}
}