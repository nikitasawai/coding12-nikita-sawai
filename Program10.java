import java.util.*;  
public class Program10 {  
 
    public int rowWithMax1s(int[][] matrix) {  
        int m = matrix.length, n = matrix[0].length;  
     
        int maxRow = -1, maxCount = -1;  
  
        // Iterating through each row of the matrix  
        for (int i = 0; i < m; i++) {  
            // Counting the number of 1s in the current row  
            int count = countOnes(matrix[i]);  
            // Updating the maximum count and the corresponding row index if the current count is greater than the maximum count  
            if (count > maxCount) {  
                maxCount = count;  
                maxRow = i;  
            }  
        }  
  
        // Returning the row index with the maximum number of 1s  
        return maxRow;  
    }  
  
    // Defining the helper method to count the number of 1s in a given row using row-wise traversal  
    private int countOnes(int[] arr) {  
        int count = 0;  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == 1) {  
                count++;  
            }  
        }  
        return count;  
    }  
  
    // Defining the main method to test the solution  
    public static void main(String[] args) {  
        // Creating an instance of the BinaryMatrixRowWithMax1s class  
        BinaryMatrixRowWithMax1s finder = new BinaryMatrixRowWithMax1s();  
        // Defining the input matrix  
        int[][] matrix = {{0, 1, 1, 1},  
                          {0, 0, 1, 1},  
                          {1, 1, 1, 1},  
                          {0, 0, 0, 0}};  
        // Calling the rowWithMax1s method to find the row index with the maximum number of 1s  
        int maxRow = finder.rowWithMax1s(matrix);  
        // Printing the result  
        System.out.println("Row with maximum 1s: " + maxRow);  
    }  
}  
