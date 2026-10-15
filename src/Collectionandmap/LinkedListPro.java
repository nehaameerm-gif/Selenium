package Collectionandmap;

import java.util.LinkedList;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LinkedList<String> li = new LinkedList<String>();

		li.add("Anurag");
		li.add("50");
		li.add("Aswajith");
		li.add("40");
		li.add("Riya");
		li.add("40.8");
		
		//display collection elements
		System.out.println(li);
				
		//element size
		System.out.println("Collection Size = "+(li.size()));
		
		for(String data : li) {
			System.out.println(data);
		}
		
		
				
	}

}
