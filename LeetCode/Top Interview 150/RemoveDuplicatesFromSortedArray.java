// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int rd = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
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
