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