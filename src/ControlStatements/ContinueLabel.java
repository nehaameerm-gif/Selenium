package ControlStatements;

public class ContinueLabel {
	public static void main(String[] args) {
	outer:for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2&&j==3) {//it skip 2 3 and 2 4
					continue outer;
				}
				System.out.println(i+" "+j);
			}
		}
		
	}


}
