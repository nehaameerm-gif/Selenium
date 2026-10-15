package Classwork;

public class CS9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				for (int i = 1; i <= 500; i++) {
		            int a = i / 100;
		            int b = (i / 10) % 10;
		            int c = i % 10;

		            if (i == (a * a * a) + (b * b * b) + (c * c * c)) {
		                System.out.println(i);
		            }
		        }

			}

		

	}

