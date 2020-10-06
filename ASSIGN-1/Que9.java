/*
09.	Write a program to read the days (eg. 670 days) as
 integer value using Scanner class. Now convert the entered 
 days into complete years, months and days and print them.
 */
import java.util.*;
class Que9{
    public static void main(String args[]){
      int d,day,month,year;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number Of Days: ");
      d = sc.nextInt();
      
      year = d/365; 
      d = d % 365;
      System.out.println("Year = "+year);
      
      month = d/30;
      d = d%30;
      System.out.println("Month = "+month);
      
      day = d;
      System.out.println("Day = "+day);
    }

}