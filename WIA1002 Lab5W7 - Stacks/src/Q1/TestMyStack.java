package Q1;

public class TestMyStack {
    public static void main(String[] args) {

        // Character stack
        MyStack<Character> charStack = new MyStack<>();

        charStack.push('a');
        charStack.push('b');
        charStack.push('c');

        System.out.println("Stack: " + charStack);

        System.out.println("Is 'b' in stack? " + charStack.search('b'));
        System.out.println("Is 'k' in stack? " + charStack.search('k'));

        // Integer stack
        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Stack: " + intStack);
        System.out.println("Is 6 in stack? " + intStack.search(6));
    }
}
