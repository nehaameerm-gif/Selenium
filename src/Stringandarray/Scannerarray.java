package Stringandarray;

import java.util.Scanner;

public class Scannerarray {
	
	   public static void main(String arhs[]) {
		   Scanner scan=new Scanner(System.in);
		   int arraysize;
		   
		   System.out.println("Enter array size : ");
		   arraysize =scan.nextInt();
		   
		   //array declaration
		   int arr[]=new int[arraysize];
		   System.out.println("Enter array elements : ");
		   
		   
		   for(int i=0;i<arr.length;i++) {
			   arr[i]=scan.nextInt();
		   }
		   //display array elements
		   System.out.println("Array elements : ");
		   for(int i=0;i<arr.length;i++) {
			   System.out.println(arr[i]);
		   }
		   
	   }

	}



