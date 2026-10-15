package Stringandarray;

public class Multidimensional_array {
		public static void main(String args[]) {
			//initialization
			int arr[][]=new int[3][2];
			
			//declaration
			arr[0][0]=20;
			arr[0][1]=30;
			
			arr[1][0]=40;
			arr[1][1]=50;
			
			arr[2][0]=60;
			arr[2][1]=70;
			
			System.out.println(arr[1][0]);//random access
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]+" ");	
				}
				System.out.println();
			}
			
			//array declaration with initialization
			int a[][]= {{2,4},{6,8},{10,12}};
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
					System.out.println(a[i][j]);
				}
				System.out.println();
			}
		}

	}



