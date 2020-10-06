//30.	Create an integer type 2-D array of size [3X3]. 
//Take the elements from the user and then calculate the sum
// of the elements present in the diagonal.

import java.io.*; 
  
public class DarrayQ30 { 
  
    static void printDiagonalSums(int [][]mat,int n) 
    { 
        int principal = 0, secondary = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
      
                // Condition for principal 
                // diagonal 
                if (i == j) 
                    principal += mat[i][j]; 
      
                // Condition for secondary 
                // diagonal 
                if ((i + j) == (n - 1)) 
                    secondary += mat[i][j]; 
            } 
        } 
      
        System.out.println("Principal Diagonal:"
                                    + principal); 
                                      
        System.out.println("Secondary Diagonal:"
                                    + secondary); 
    } 
  
    // Driver code 
    static public void main (String[] args) 
    { 
          
        int [][]a = { { 1, 2, 3 }, 
                      { 5, 6, 7 },  
                      { 1, 2, 4 }, }; 
                      
        printDiagonalSums(a, 3); 
    } 
} 