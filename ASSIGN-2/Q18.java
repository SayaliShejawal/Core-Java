// 18 - Program to check whether number is prime or not.
import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i<=num; i++) {
			
				if(num%i == 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Number is prime");
			}
			else {
				System.out.println("Number is not prime");
			}
	}
	
}
