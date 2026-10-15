package Classwork;

import java.util.Scanner;

public class CS5 {
	  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	        System.out.println("Input a number: ");
	        int num = scan.nextInt();

	        if (num % 2 == 0) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }
	    }
	}

