package Queue;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase for accuracy
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Using standard Java Collections for the demonstration
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add each character to both the Queue and the Stack
        for (int i = 0; i < cleanInput.length(); i++) {
            char c = cleanInput.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        // Compare characters from both structures
        while (!queue.isEmpty()) {
            // Queue.remove() gives the first char; Stack.pop() gives the last char
            if (!queue.remove().equals(stack.pop())) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }
}