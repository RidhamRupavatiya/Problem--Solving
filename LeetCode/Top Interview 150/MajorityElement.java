// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int nums[] = {2,2,1,1,1,2,2}; 
        System.out.println(obj.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        // Moore's voting algorithm
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
}
