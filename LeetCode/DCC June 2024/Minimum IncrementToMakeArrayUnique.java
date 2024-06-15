class Solution {
    public int minIncrementForUnique(int[] nums) {
        // first sort the array
        Arrays.sort(nums);
        // initialize minimun incremen by 0
        int minInc = 0;
        // loop
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                minInc += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return minInc;
    }
}