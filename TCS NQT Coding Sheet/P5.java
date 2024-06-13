// Count frequency of each element in the array

import java.util.*;

class P5{
    public static void main(String[] args) {
        CountFrequency cf = new CountFrequency();
        int[] arr = {2,2,3,4,4,2};
        int n = arr.length;
        cf.countFrequency(arr,n);
    }
}
class CountFrequency{
    public void countFrequency(int arr[],int n){
        boolean visited[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count = 1;-
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}