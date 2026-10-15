package Collectionandmap;

import java.util.PriorityQueue;

public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PriorityQueue ob = new PriorityQueue();

	        ob.add("Hello");
	        ob.add("Good");
	        ob.add("122");
	        ob.add("222");

	        System.out.println(ob);

	        ob.add("Good");

	        System.out.println(ob);

	        ob.remove();

	        System.out.println(ob);

	}

}