package operators;

public class Task4 {
    public void maths() {
    	int x=10,y=5,z=8,eqn;
    	eqn=x+z/x+(z%y)*(z-x);
    	System.out.println("Answer : "+eqn);
    }
    public static void main(String args[]) {
    	Task4 obj=new Task4();
    	obj.maths();
    }
}
