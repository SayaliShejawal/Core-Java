//Q.16  Write a program to print table of any entered number using loop.

import java.util.Scanner;

class Q16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int i = 1;
		System.out.println("Table of "+num+" is:");
		while(i <= 10){
			
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
			
			
		}
	}
	
}