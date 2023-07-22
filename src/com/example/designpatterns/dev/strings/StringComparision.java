package com.dev.strings;

public class StringComparision {
	public static void main(String[] args) {
		

	
	String str1 = "alok";
	String str2 = new String("alok");
	String str3 = new String("alok");
 
	System.out.println(str1==str2);  // object compare
	System.out.println(str1.equals(str2));  // value compare
	System.out.println(str2.equals(str3)); // value compare
	System.out.println(str2==str3);
	
	System.out.println("Madam"+1+2);
	System.out.println(1+2+"Madam");
}
}