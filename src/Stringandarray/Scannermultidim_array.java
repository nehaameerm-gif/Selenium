package Stringandarray;

import java.util.Scanner;

public class Scannermultidim_array {
		public static void main(String args[]) {
			Scanner scan =new Scanner(System.in);
			int row,column;
			
			System.out.println("Enter Row size: ");
			row = scan.nextInt();
			
			System.out.println("Enter Column size: ");
			column = scan.nextInt();
			
			int arr[][]=new int[row][column];
			System.out.println("Enter array elements : ");
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					arr[i][j]=scan.nextInt();
				}
				
			}
			System.out.println("Array elements :");
			for(int i=0;i<arr.length;i++) {
				System.out.println(i);
				
				}
				
			}
			
			
		}

	



