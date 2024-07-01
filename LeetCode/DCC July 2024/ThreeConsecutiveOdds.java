// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 
// Example 1:

// Input: arr = [2,6,4,1]
// Output: false
// Explanation: There are no three consecutive odds.

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 1){
                ++oddCount;
            }
            else{
                oddCount = 0;
            }
            if(oddCount == 3){
                return true;
            }
        }
        return false;
    }
}