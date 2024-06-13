// W.A.P. to check given number is prime or not.

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int count = 0;
        for(int i=2; i<=num/2 ; i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("is Prime Number");
        }
        else{
            System.out.println("is Not Prime");
        }
    }
}
