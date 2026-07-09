package Q1;
import java.util.Scanner;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string (max 15 chars): ");
        String input = sc.nextLine();

        MyStack<Character> stack = new MyStack<>();

        // Push all chars
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
