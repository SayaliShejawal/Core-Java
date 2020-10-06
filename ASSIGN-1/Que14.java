/*14.	Program to check that entered year
 is a leap year or not.
*/
 import java.util.*;
class Que14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter A Year: ");
        year = sc.nextInt();
        if(year % 400 == 0){
                System.out.println(year+" is a Leap Year");
        }
        else if(year % 100 == 0){
            System.out.println(year+" is NOT a Leap Year");
        }
        else if(year % 4 == 0){
            System.out.println(year+" is a Leap Year");
        }
        else{
            System.out.println(year+" is NOT a Leap Year");
        }
    }
}