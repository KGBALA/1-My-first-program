package day1;

import java.util.Scanner;

public class DataManipulation {
	public static void main(String[] args) {
		Scanner  scan =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println(name);
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		System.out.println(age);
		if(name.equals("James Bond")) {
			System.out.println("Names is James,James Bond");
		}else if(name.equals("james bond")) {
			System.out.println("Names is James,James Bond");
		}else {
			System.out.println("Fake bond");
		}
		
		
		
	}

}
