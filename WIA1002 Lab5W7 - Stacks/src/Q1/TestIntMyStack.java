package Q1;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Push 1 to n
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }

        // Size
        System.out.println("Stack size: " + stack.getSize());

        // Pop all
        System.out.print("Elements popped: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
//Output order = reverse (n → 1)
//Reason: Stack is LIFO (Last In First Out)
