/*
03.	Find the result of following expressions. 
You need to determine the primitive data type of 
the variable by looking carefully the given expression
and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/
class Que3{
    public static void main(String args[]){
        int x=5;
        int y;
        int z;
        y = (x * x) + (3 * x) - 7;
        System.out.println("Value of y is: "+y);
        
        y = x++ + ++x;
        System.out.println("Value of y is: "+y);
        
        z = x++ - --y - --x + x++;
        System.out.println("Value of x is: "+x);
        System.out.println("Value of y is: "+y);
        System.out.println("Value of z is: "+z);
        
        
    }
}