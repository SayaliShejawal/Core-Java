/*15.Accept person’s gender (character m for male
 and f for female), age (integer), as input and then
 check whether person is eligible for marriage or not.
*/
 import java.util.*;
class Que15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        
        System.out.println("Enter SEX: M/F ");
        char sex = sc.next().charAt(0);
        
        if(sex == 'F' || sex == 'f'){
            if('F' > 18 || 'f' >18 ){
                System.out.println("Eligible for Marraige.");
            }
            else{
                System.out.println("Not Eligible for Marraige.");
            }
        }
        else{
            if(sex == 'M' || sex == 'm' ){
                if('M' > 21 || 'm' > 21){
                    System.out.println("Eligible for Marraige.");
                }
                else{
                    System.out.println("Not Eligible for Marraige.");
                }
            }
        }   
        
    }
}