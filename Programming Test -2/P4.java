// W.A.P. to check given number is odd or even using bitwise operator.

import java.util.Scanner;

public class P4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
