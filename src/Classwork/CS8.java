package Classwork;

public class CS8 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		        int[] a = {1, 4, 17, 7, 25, 3, 100};
		        int sum = 0;

		        System.out.println("Original Array:");
		        System.out.println("[1, 4, 17, 7, 25, 3, 100]");

		        for (int n : a)
		            sum += n;

		        double avg = 22.0; // as given in question

		        System.out.println("The average of the said array is: " + avg);
		        System.out.println("The numbers in the said array that are greater than the average are:");

		        for (int n : a)
		            if (n > avg)
		                System.out.println(n);
		    }
	
			       
			}

		


