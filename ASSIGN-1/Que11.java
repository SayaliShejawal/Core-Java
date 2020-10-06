/*
10.	11.	Write a program to swap two numbers
 without using third variable. */
 import java.util.*;
class Que11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the Value of b: ");
        b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping Vaalues are: ");
        System.out.println("Enter the Value of a: "+a);
        System.out.println("Enter the Value of b: "+b);
        
        
    }
}