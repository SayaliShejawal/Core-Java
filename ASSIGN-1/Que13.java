/*13.Program to find greatest in 3 numbers.
 [ once using if else statement and then using 
 ternary operator ( logical operator) ]  
*/
 import java.util.*;
class Que13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2,greatest;
        
        System.out.println("Enter 1st No: ");
        n1 = sc.nextInt();
        System.out.println("Enter 2st No: ");
        n2 = sc.nextInt();
        
        greatest = (n1 > n2) ? n1 : n2;
        System.out.println("Greatest Number is: "+greatest);
    }
}