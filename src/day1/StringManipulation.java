package day1;

public class StringManipulation {
	public static void main(String[] args) {
		String name="james";
		//length of the string 
		//String.length()-->methods returns integer 
		//that is length of the given string
		System.out.println(name.length());
		int size=name.length();
		//charAt --> takes integer that is index and returns char 
		//that is character at given index
		char c =name.charAt(0);
		System.out.println(c);
		//indexOf--> //takes char or string and return integer 
		//that is index of given char or string
		int ii=name.indexOf("m");
		System.out.println(ii);
		//To cut string 
		//1. from index to toIndex
		//2. from index.It cuts til the end of string.
		String school="Cybertek";
		System.out.println(school.substring(0,5));
		System.out.println(school.substring(5));
		//Immutable(not changeable)
		
		System.out.println(school.isEmpty());
		
		
		
	}
}
