// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

// Example 1:

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.


import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> v = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;

            // Count occurrences of the current element
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }
            v.add(cnt);
        }

        Collections.sort(v);

        for (int i = 1; i < v.size(); i++) {
            if (v.get(i).intValue() == v.get(i-1).intValue()) {
                return false;
            }
        }
        return true;
    }
}