// accept string from user and print it in folloeing pattern. 
// H
// He
// Hel
// Hell
// Hello


import java.util.*;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:- ");
        String str1 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(str1.charAt(j));
            }  
            System.out.println(); 
        }
    }
}