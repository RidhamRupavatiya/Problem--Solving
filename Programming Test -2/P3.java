// W.A.P. to check given number is palindrome or not.

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int temp = num;

        int rev=0;
        while (num>0) {
            int rem = num % 10;
            rev = (rev*10) + rem;
            num = num / 10;
        }

        System.out.println(rev);

        if(rev == temp){
            System.out.println("Number is Pallindrome.");
        }
        else{
            System.out.println("Number is not Pallindrome.");
        }
    }
}
