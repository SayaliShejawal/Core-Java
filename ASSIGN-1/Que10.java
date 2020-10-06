/*
10.	Write a program to convert temperature from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class.[ formula : C= 5*(f-32)/9 ]
 */
 import java.util.*;
class Que10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float f,c;
        System.out.println("Enter the temperature in Fahrenheit: ");
        f = sc.nextFloat();
        c = 5 *(f-32)/9;
        System.out.println("Temperature in Celsius is: "+c);
        
        
    }
}