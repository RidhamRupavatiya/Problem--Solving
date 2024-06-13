import java.util.*;
public class LargestElement{
    public static void main(String[] args) {
        int[] arr1 = {8,4,7,5,1,6,10,9};

        // Sort array
        Arrays.sort(arr1);

        // print Array's first element
        System.out.println("Smallest Element of Aray is :- " + arr1[arr1.length-1]);
    }
}