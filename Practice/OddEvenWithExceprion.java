// write a program to get input from user and find number is odd or even and give an error is the input is string then give message this is string and if it is floating number then give this is floting number.

import java.util.Scanner;

class OddEvenWithExceprion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number :- ");
        String input = sc.nextLine();

        // handle an exception if input it is a string.
        try {
            // parse the value in double
            double number = Double.parseDouble(input);

            // to check if a number is an integer
            if(number == Math.floor(number)){
                int intNumber = Integer.parseInt(input);
                // check number is even or odd.
                if(intNumber % 2 == 0){
                    System.out.println(intNumber+ " is an even number.");
                }
                else{
                    System.out.println(intNumber+ " is an odd number.");
                }
            }
            else{
                System.out.println("This is a floating-point number.");
            }
        } catch (Exception e) {
            // If parsing fails, it's a string
            System.out.println("This is a string.");
        }
    }
}