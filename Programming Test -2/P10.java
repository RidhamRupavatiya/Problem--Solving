// W.A.P. to read the size of square and character to print the square.
// Example:
// Enter the size of square: 5
// Enter the character: #
// #    #    #    #    #
// #                       #
// #                       #
// #                       #
// #    #    #    #    #

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Square:-");
        int square = sc.nextInt();

        System.out.println("Enter the character to prime the square :- ");
        char ch = sc.next().charAt(0);

        for(int i = 0; i < square; i++) {
            for(int j=0; j<square; j++){
                if(i==0 || i==square-1 || j==0 || j==square-1){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
