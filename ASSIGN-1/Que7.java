/*
07.	Write a program to calculate sum of 5 subject’s marks &
 find percentage. Take the obtained marks from user using Scanner
 class. Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.
 */
import java.util.*;
class Que7{
    public static void main(String args[]){
      float m1,m2,m3,m4,m5,avg, percentage,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Marks of 5 Subjects: ");
      m1 = sc.nextFloat();
      m2 = sc.nextInt();
      m3 = sc.nextInt();
      m4 = sc.nextInt();
      m5 = sc.nextInt();
      
      sum = m1+m2+m3+m4+m5;
      avg = sum/5;
      percentage = (sum/500)*100;
      System.out.println("Average is: "+avg);
      System.out.println("Percentage marks= "+percentage+ "%");
    }

}