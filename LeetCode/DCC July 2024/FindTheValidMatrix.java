// You are given two arrays rowSum and colSum of non-negative integers where rowSum[i] is the sum of the elements in the ith row and colSum[j] is the sum of the elements of the jth column of a 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums of each row and column.

// Find any matrix of non-negative integers of size rowSum.length x colSum.length that satisfies the rowSum and colSum requirements.

// Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed that at least one matrix that fulfills the requirements exists.


// Example 1:

// Input: rowSum = [3,8], colSum = [4,7]
// Output: [[3,0],
//          [1,7]]
// Explanation: 
// 0th row: 3 + 0 = 3 == rowSum[0]
// 1st row: 1 + 7 = 8 == rowSum[1]
// 0th column: 3 + 1 = 4 == colSum[0]
// 1st column: 0 + 7 = 7 == colSum[1]
// The row and column sums match, and all matrix elements are non-negative.
// Another possible matrix is: [[1,2],
//                              [3,5]]

import java.util.*;

class FindTheValidMatrix{
    public static void main(String[] args) {
        FindTheValidMatrix obj = new FindTheValidMatrix();
        int rowSum[] = {3,8};
        int colSum[] = {4,7};
        int ans[][] = obj.restoreMatrix(rowSum, colSum);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.err.print(ans[i][j]);
            }
        }
    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] mat = new int[m][n];

        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();

        while(rSet.size() != m && cSet.size() != n){
            int ri = minInd(rowSum, rSet);
            int ci = minInd(colSum, cSet);
            if(rowSum[ri] < colSum[ci]){
                mat[ri][ci] = rowSum[ri];
                colSum[ci] -= rowSum[ri];
                rSet.add(ri);
            } else{
                mat[ri][ci] = colSum[ci];
                rowSum[ri] -= colSum[ci];
                cSet.add(ci);
            }
        }
        return mat;
    }
    private int minInd(int[] a, Set<Integer> set){
        int min = Integer.MAX_VALUE;
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min && !set.contains(i)){
                min = a[i];
                ind = i;
            }
        }
        return ind;
    }
}