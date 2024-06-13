// Accept three integer values from the user and display them in ascending order using only
// operators (i.e. without using if…else, switch case, or loop)

import java.util.Scanner;

class p13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("--------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}