// Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

// Return the positive integer k. If there is no such integer, return -1.

 

// Example 1:

// Input: nums = [-1,2,-3,3]
// Output: 3
// Explanation: 3 is the only valid k we can find in the array.

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for(int i=n-1 ; i>=0; i--){
            if(nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0){
                return nums[i];
            }
        }
        return -1;
    }
}