// W.A.P. to find the largest number from given 3 numbers using conditional operator.

import java.util.Scanner;

class P1{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter First Number:- ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number:- ");
        int n2 = sc.nextInt();

        System.out.print("Enter Third Number:- ");
        int n3 = sc.nextInt();

        int largestNum = n1>n2 ? (n1>n3?n1:n3) : (n2>n3?n2:n3);

        System.out.println("Largest Num is :- "+largestNum);
    }

}