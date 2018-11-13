package day1;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter number");
		int num =scan.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Please enter your number" +(i+1));
			  int num1 =scan.nextInt();
			
			
			
			if(num1%2==0) {
				System.out.println(num1+"Even");
			}else {
				System.out.println(num1+"odd");
			}
		}
		
	}

}
