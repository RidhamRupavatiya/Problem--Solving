// Check wheather string is pallindrome or not.

public class PallindromeString {
    public static void main(String[] args) {
        String str = "ridham";

        // Use StringBuilder to build the reversed string
        StringBuilder revstr = new StringBuilder();

        // Append characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr.append(str.charAt(i));
        }

        System.out.println(revstr.toString());

        // Compare the reversed string with the original string
        if (revstr.toString().equals(str)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}
