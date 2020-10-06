//29.	Write a program to print the total number of one-D arrays in a two-D array and
 the number of elements in every one-D array present in the two-D arrays.

class MArrayQ29 { 
    public static void main(String[] args) 
    { 
  
        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
  
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]); 
    } 
} 