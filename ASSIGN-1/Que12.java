/*
12.In a company an employee is paid as under: If his basic salary
 is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90%
 of basic salary. If his salary is either equal to or above Rs. 10000,
 then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's 
 salary is input by the user write a program to find his gross salary.
 [ formula : GS= Basic + DA + HRA ]
*/
 import java.util.*;
class Que12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int BS,HRA,DA,GS;
        
        System.out.println("Enter the Basic Salary: ");
        BS = sc.nextInt();
        
        if (BS < 10000){
            HRA = BS *10/100;
            DA = BS * 90 /100;
        }
        else{
            HRA = 2000;
            DA = BS * 98 /100;
        }
        GS = BS + HRA + DA;
        System.out.println("Your entered Basic Salary is: "+BS);
        System.out.println("HRA  is: "+HRA);
        System.out.println("DA is: "+DA);
        System.out.println("GS is: "+GS);
    }
}