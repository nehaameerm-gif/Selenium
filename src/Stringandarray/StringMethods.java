package Stringandarray;

public class StringMethods {

	public static void main(String args[]) {
	//length
	String s1="India";
	System.out.println(s1.length());
	
	//charAt
	String s2="Calicut";
	System.out.println(s2.charAt(3));
	
	//CompareTo
	String a="hello";
	String b="hello";
	String c="hai";
	String d="flag";
	
	System.out.println(a.compareTo(b));
	System.out.println(a.compareTo(c));
	System.out.println(c.compareTo(b));
	
	//Contains
	String s3="Java is a high level programing language";
	System.out.println(s3.contains("low level"));
	System.out.println(s3.contains("high level"));
	
	//Upper case
	String s4="software testing";
	System.out.println(s4.toUpperCase());
	
	//Lower case
		String s5="APPLE";
		System.out.println(s5.toLowerCase());
	
	//getBytes
		String s6="flower";
		byte f[]=s6.getBytes();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		//equals
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		
	//equals ignore case
		String s7="HAI";
		String s8="hai";
		String s9="hello";
		System.out.println(s7.equalsIgnoreCase(s8));
		System.out.println(s7.equalsIgnoreCase(s9));
		
	//substring
		String s="Software testing";
		System.out.println(s.substring(4));//start index
		System.out.println(s.substring(8,13));//start and end index
		
	//Starts with
		System.out.println(s.startsWith("S"));
		System.out.println(s.startsWith("d"));
		
		//Ends with
				System.out.println(s.endsWith("g"));
				System.out.println(s.endsWith("s"));

	//replace
				String st1="flowers";
				System.out.println(st1.replace('f', 's'));
			
		//trim
				String st2=" apple       ";
				System.out.println(st2+"Fruit");
				System.out.println(st2.trim()+"Fruit");
		
		
		

	}

}
