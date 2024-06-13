// Accept a positive number from the user and print a message stating whether the number entered is even or odd WITHOUT using the module (%)operator and if... else statements.

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int temp = num;

        if((num/2)*2 == temp){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
