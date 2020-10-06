/*
04.	Write a program that initializes 2 byte type of variables.
 Add the values of these variables and store in a byte type 
of variable.Note: primitive down casting is required in this program ].
*/
class Que4{
    public static void main(String args[]){
       byte i = 10;
       byte j = 5;
       /*int a = i;
       int b = j;
       int c = a+b;
       byte b1 = (byte)c;
       */
       byte k = (byte) (i+j);
       System.out.println(k);
    }

}