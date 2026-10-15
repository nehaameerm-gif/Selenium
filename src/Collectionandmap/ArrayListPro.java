package Collectionandmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li =new ArrayList();
		
		li.add("Anurag");
		li.add(50);
		li.add("Aswajith");
		li.add(40);
		li.add("Riya");
		li.add(40.8);
		
		//display collection elements
		System.out.println(li);
		
		//element size
		System.out.println("Collection Size = "+(li.size()));
		
		//for loop-display elements in sequential way
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		//random access
		System.out.println("4th index value : "+(li.get(3)));
       	
		li.add("Minsha");
		li.add(48);
		System.out.println(li);
		
		//remove
		li.remove(5);
		System.out.println(li);
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List li1=new ArrayList();
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		
		System.out.println(li.contains("Minsha"));
		
		
	}
}
