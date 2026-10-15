package Stringandarray;

public class Stringbasic {
	public static void main(String args[]) {
		//char array
		char exp[]= {'h','e','l','l','o'};
		
		System.out.println(exp[2]);//random access
		System.out.println(exp);//it prints all characters and it works only char 
		
		//simple for loop
		for(int i=0;i<exp.length;i++) {
			System.out.println(exp[i]);
		}
		
		//for each
		for(char data:exp) {
			System.out.println(data);
		}
		//String array
		String names[]= {"Nayana","Minsha","Aslaha","Fidha"};
		System.out.println(names[1]);
		
		for(String data:names) {
			System.out.println(data);
			
		}
	
		
		//String Literals-->String Constant pool
	
		String name1="Arun";
		String name2="Athul";
		//compare
		System.out.println(name1==name2);
		
		//new keyword-->heap memory,String constant pool
		String name3=new String("Athul");
		String name4=new String("Athul");
		//compare
		System.out.println(name3==name4);
		
		//String method->equals
		System.out.println(name3.equals(name4));
		
		//compare
		System.out.println(name2==name3);
		System.out.println(name2.equals(name3));
		
		//join two strings
        //System.out.println(name1+"Thomas");
		//other way
		name1=name1+"Thomas";
		System.out.println(name1);
		
		//using concat()
		name2.concat("Das");
		System.out.println(name2);//String is immutable 
		
		//string buffer and string builder
		StringBuffer st=new StringBuffer("Mohan");
		StringBuilder st1=new StringBuilder("Das");
		
		st.append(st1);
		System.out.println(st);//mutable
		
		st.append("V");
		System.out.println(st);
		
		
		
		
	}

}
