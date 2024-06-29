// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


class Solution {
    public void sortColors(int[] nums) {
        // for Count a numbers 
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCnt++;
            }else if(nums[i] == 1){
                oneCnt++;
            }else{
                twoCnt++;
            }
        }

        // initialize array iterator
        int arrayIterator = 0;

        // Place All 0s into arrayIterator
        for(int i = 0; i < zeroCnt; i++){
            nums[arrayIterator] = 0;
            arrayIterator++;
        }

        // Place All 1s into arrayIterator
        for(int i = 0; i < oneCnt; i++){
            nums[arrayIterator] = 1;
            arrayIterator++;
        }

        // Place All 2s into arrayIterator
        for(int i = 0; i < twoCnt; i++){
            nums[arrayIterator] = 2;
            arrayIterator++;
        }
    }
}