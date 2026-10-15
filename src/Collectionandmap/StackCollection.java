package Collectionandmap;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> ob = new Stack<Integer>();
		ob.push(11);
		ob.push(20);
		ob.push(2);
		ob.push(1);
		
		System.out.println(ob);
		ob.push(20);
		System.out.println("Elements : "+ob);
		
		System.out.println("Top element is : "+ob.peek());
		
		ob.pop();
		System.out.println(ob);
		
		System.out.println("Top element is : "+ob.peek());
	}

}
