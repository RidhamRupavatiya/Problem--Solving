// Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.

// To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions, treat the missing revision values as 0.

// Return the following:

// If version1 < version2, return -1.
// If version1 > version2, return 1.
// Otherwise, return 0.
 

// Example 1:

// Input: version1 = "1.2", version2 = "1.10"

// Output: -1

// Explanation:

// version1's second revision is "2" and version2's second revision is "10": 2 < 10, so version1 < version2.

class Solution {
    public int compareVersion(String version1, String version2) {
        int v1Len = version1.length();
        int v2Len = version2.length();
        int i=0;
        int j=0;
        while(i<v1Len || j<v2Len){
            int n1=0;
            int n2=0;
            while(i<v1Len && version1.charAt(i) != '.'){
                n1 = 10 * n1 + (version1.charAt(i++) - '0');
            }
            while(j<v2Len && version2.charAt(j) != '.'){
                n2 = 10 * n2 + (version2.charAt(j++) - '0');
            }
            if(n1 < n2)
                return -1;
            if(n1 >  n2)
                return 1;
            i++;
            j++;
        }
        return 0;
    }
}