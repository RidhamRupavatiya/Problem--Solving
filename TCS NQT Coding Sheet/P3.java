// Find Second Smallest and Second Largest Element in an array

import java.util.Arrays;
public class P3 {
    public static void main(String[] args) {
        int arr1[] = {8,5,4,3,5,7,8,9};

        int n = arr1.length;

        Arrays.sort(arr1);

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }
        System.out.println("\n");

        int secondSmallElement = arr1[1];
        int secondLargeElement = arr1[n-2];

        System.out.println("Second Small Element : "+secondSmallElement);
        System.out.println("Second Large Element : "+secondLargeElement);
    }
}
