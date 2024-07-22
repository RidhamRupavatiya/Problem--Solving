// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 
import java.util.*;
class SortThePeople{
    public static void main(String[] args) {
        SortThePeople obj = new SortThePeople();
        String names[] = {"Mary","John","Emma"};
        int heights[] = {180,165,170};
        String ans[] = obj.sortPeople(names, heights);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> people = new HashMap<>();
        for(int i=0; i<n; i++){
            people.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int ind = -1;
        for(int i=n-1; i>=0; i--){
            ind++;
            names[ind] = people.get(heights[i]);
        }
        return names;
    }
}