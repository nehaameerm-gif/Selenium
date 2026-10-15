package ControlStatements;

public class Breaklabel {
	public static void main(String args[]) {
	//label
		outer: for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
				if(i==2&&j==2) {//it prints before 2 2 and also 2 2
					break outer;
				}
				
				
			}
			System.out.println();
		}
	}

}
