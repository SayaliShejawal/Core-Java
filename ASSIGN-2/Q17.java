//Q.17- Write a program to reverse a given number.

import java.util.Scanner;

class Q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int rev = 0;
		
		while(num != 0 ) { 
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num/10;
		}
		System.out.println("Reverse Number is: " + rev);
		
	}
	
}