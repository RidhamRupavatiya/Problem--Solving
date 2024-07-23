// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

// Example 1:

// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
// Example 2:

// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

import java.util.*;
class SortArrayByIncreasingFrequency{
    public static void main(String[] args) {
        SortArrayByIncreasingFrequency obj = new SortArrayByIncreasingFrequency();
        int nums[] = {1,1,2,2,2,3};
        int ans[] = obj.frequencySort(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((entry1, entry2)->{
            int valueCompare = entry1.getValue().compareTo(entry2.getValue());
            if(valueCompare != 0){
                return valueCompare;
            }else{
                return entry2.getKey().compareTo(entry1.getKey());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : entryList){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int[] sorted = new int[n];
        int index = 0;

        for(Map.Entry<Integer,Integer> entry : sortedMap.entrySet()){
            for(int i=0;i<entry.getValue(); i++){
                sorted[index] = entry.getKey();
                index++;
            }
        }
        return sorted;
    }
}