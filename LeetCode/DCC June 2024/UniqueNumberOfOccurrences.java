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