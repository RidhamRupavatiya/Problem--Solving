// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.


// Example 1:

// Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
// Output: [15]
// Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
// Example 2:

// Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
// Output: [12]
// Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

import java.util.*;
public class LuckeyNumberInMatrix {
    public static void main(String[] args) {
        LuckeyNumberInMatrix obj = new LuckeyNumberInMatrix();
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = new ArrayList<Integer>();
        ans =  obj.luckyNumbers(matrix);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] min_row = new int[rows];
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<rows;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<cols; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            min_row[i] = min;
        }
        for(int i=0; i<cols;i++){
            int max = Integer.MIN_VALUE;
            int itr = 0;
            for(int j=0; j<rows; j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                    itr = j;
                }
            }
            if(max==min_row[itr]){
                ans.add(max);
            }
        }
        return ans;
    }
}
