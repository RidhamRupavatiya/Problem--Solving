public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {45,65,98,74,71,23,65,14,41};

        System.out.println("Original Array :-");
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();

        System.out.println("Reverse Array :- ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+",");
        }
        System.out.println("\n");
    }
}
