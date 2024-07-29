// There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

// You have to form a team of 3 soldiers amongst them under the following rules:

// Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
// A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
// Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

// Example 1:

// Input: rating = [2,5,3,4,1]
// Output: 3
// Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 

class CodeNumberOfTerms{
    public static void main(String[] args) {
        CodeNumberOfTerms obj = new CodeNumberOfTerms();
        int rating[] = {2,5,3,4,1};
        System.out.println(obj.numTeams(rating));
    }
    public int numTeams(int[] rating) {
        int lessThanILeft[] = new int[rating.length];
        int lessThanIRight[] = new int[rating.length];
        int greatherThanILeft[] = new int[rating.length];
        int greatherThanIRight[] = new int[rating.length];
        for (int i = 0; i < rating.length; i++) {
            int less=0, greather = 0; 
            for (int j = 0; j < i; j++) {
                if(rating[j] < rating[i]) less++;
                else greather++;
            }
            lessThanILeft[i] = less;
            greatherThanILeft[i] = greather;
            less = 0;
            greather = 0;
            for (int j = i+1; j < rating.length; j++) {
                if(rating[j] < rating[i]) less++;
                else greather++;
            }
            lessThanIRight[i] = less;
            greatherThanIRight[i] = greather;
        }
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            count += lessThanILeft[i] * greatherThanIRight[i];
            count += lessThanIRight[i] * greatherThanILeft[i];
        }
        return count;
    }
}