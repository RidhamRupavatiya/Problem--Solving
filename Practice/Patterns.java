// 1.	Write a recursive function for adding a number up 10.

// 2.	 A[] = {1,4,5,6,7,8,12} write a program which is reverse an number in same array.

// 3.	1 2 3 4 5
//      1 2 3 4
//      1 2 3 
//      1 2
//      1

// 4.	A
//      B B
//      C C C
//      D D D D


// public class Patterns {
//     public static void main(String[] args) {
//         int initialNum = 1;
//         int total = addToTen(initialNum);
//         System.out.println(total);
//     }
//     public static int addToTen(int initialNum){
//         if(initialNum == 10){
//             return 10;
//         }
//         return initialNum + addToTen(initialNum+1);
//     }
// }


// public class Patterns{
//     public static void main(String[] args) {
//         int a[] = {1,4,5,6,7,8,12,13};
//         int len = a.length;
//         for (int i = 0; i < len/2-1 ; i++) {
//             int temp = a[i];
//             a[i] = a[len-i-1];
//             a[len-i-1] = temp;
//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args) {
//         int row = 5;
//         for (int i = row-1; i >= 0; i--) {
//             int num = 1;
//             for(int j = 0; j < i+1; j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

public class Patterns{
    public static void main(String[] args) {
        int asci = 65;
        int row = 5;
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < i+1 ; j++){
                System.out.print((char)asci);
            }
            asci++;
            System.out.println();
        }
    }
}