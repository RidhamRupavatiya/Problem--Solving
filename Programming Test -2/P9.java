// W.A.P. to read n numbers in an array and remove the duplicates from an array

public class P9 {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,6,6,7};
        int n= arr.length-1;

        for(int i=0 ; i<=n ;i++){
            for(int j=i+1; j<= n ; j++){
                if(arr[i]==arr[j]){
                    for(int k=j; k<=n-1 ;k++){
                        arr[k] = arr[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        for(int i=0; i<=n ; i++){
            System.out.println(arr[i]);
        }
    }
}
