/*
08.	Write a program to find the simple interest. Take the
 principle amount, rate of interest and time from user using
 Scanner class.
 */
import java.util.*;
class Que8{
    public static void main(String args[]){
      float  amt,rate,t,SI;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Amount: ");
      amt = sc.nextFloat();
      
      System.out.println("Enter the Rate: ");
      rate = sc.nextFloat();
      
      System.out.println("Enter the Time: ");
      t = sc.nextFloat();
      
      SI =(amt*rate*t)/100;
      System.out.println("Simple Interest is: "+SI);
      
    }

}