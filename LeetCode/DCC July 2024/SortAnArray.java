// Given an array of integers nums, sort the array in ascending order and return it.

// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

// Example 1:

// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

public class SortAnArray {
    // merge Sort
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
     }
     private void mergeSort(int nums[], int si, int ei){
         if(si >= ei){
             return;
         }
 
         int mid = si + (ei - si)/2; // (si+en)/2
         mergeSort(nums, si, mid); // left part
         mergeSort(nums, mid+1, ei); // right part
         merge(nums, si, mid, ei);
     }
     private void merge(int nums[], int si, int mid, int ei){
         int temp[] = new int[ei-si+1];
         int i = si;   // iteration for left part
         int j = mid + 1;   // iteration for right part
         int k = 0;    // for temp numsay
         
         while(i <= mid && j <= ei){
             if(nums[i] < nums[j]){
                 temp[k] = nums[i];
                 i++;
             } else{
                 temp[k] = nums[j];
                 j++;
             }
             k++;
         }
 
         // left part
         while(i <= mid){
             temp[k] = nums[i];
             k++; i++;
         }
 
         // right part
         while(j <= ei){
             temp[k] = nums[j];
             k++;j++;
         }
 
         // copy to original numsay
         for(k=0, i=si; k<temp.length; k++, i++){
             nums[i] = temp[k];
         }
     }
}
