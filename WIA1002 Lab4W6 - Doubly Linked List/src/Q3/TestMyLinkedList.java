package Q3;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // 1. Add elements
        list.addLast(1);
        list.addLast(10);
        list.addLast(100);

        // 2. Add at index 2
        list.add(2, 2);

        // 3. Remove at index 3
        list.remove(3);

        // 4. Traversal
        list.iterateForward();
        list.iterateBackward();

        // 5. Size and Clear
        System.out.println("size of current Doubly Linked List: " + list.getSize());
        list.clear();
        System.out.println("size of current Doubly Linked List: " + list.getSize());
    }
}
