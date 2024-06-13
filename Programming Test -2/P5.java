// W.A.P. to print series 1, 3, 6, 10, 15, …

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int ans=0;
        for (int i = 0; i < num; i++) {
            ans = ans + i + 1;
            System.out.println(ans);
        }
    }
}
