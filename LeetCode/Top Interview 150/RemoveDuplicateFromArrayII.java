// Example 1:

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveDuplicateFromArrayII {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[j-1]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int nums[] = {10,20,20,30,30,30,40,40,40,40};
        int rd = removeDuplicates(nums);
        for(int i=0; i<rd; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
