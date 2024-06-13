// Accept two integers from the user and calculate the sum of last digits of both the integers. For example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1:- ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number2:- ");
        int num2 = sc.nextInt();

        System.out.println("Sum of Last Digit is :- "+ (num1%10 + num2%10));
    }
}
