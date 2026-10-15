package Collectionandmap;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetCollection {

    public static void main(String[] args) {

        HashSet ob = new HashSet();

        ob.add("Anu");
        ob.add("123");
        ob.add("meenu");
        ob.add("Raju");

        System.out.println(ob);

        for (Object data : ob) {
            System.out.println(data);
        }

        System.out.println();
        
        

        Iterator itr = ob.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        

        ob.add(null);
        ob.add("Aswajith");

        System.out.println(ob);
    }
}