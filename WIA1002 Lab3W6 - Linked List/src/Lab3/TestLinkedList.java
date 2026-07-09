package Lab3;

public class TestLinkedList {
    public static void main(String[] args) {
        // Create an instance of MyLinkedList
        MyLinkedList<String> list = new MyLinkedList<>();

        // a. Append the following: a, b, c, d, e
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");

        // b. Print all the elements in the list
        System.out.print("b. Current List: ");
        list.print();

        // c. Reverse all the elements in the list
        System.out.print("c. Reversed List: ");
        list.reverse();

        // d. Retrieve the number of elements in the list
        System.out.println("d. Number of elements: " + list.getSize());

        // e. Retrieve the first and last value
        System.out.println("e. First value: " + list.getFirst());
        System.out.println("e. Last value: " + list.getLast());

        // f. Delete the third value (index 2)
        String removed = list.remove(2);
        System.out.println("f. Deleted third value: " + removed);
        System.out.print("   List after deletion: ");
        list.print();

        // g. Retrieve the index location for the second and third value
        System.out.println("g. Index of second value ('b'): " + list.indexOf("b"));
        System.out.println("g. Index of third value ('d'): " + list.indexOf("d"));

        // h. Checks if the list has the value ‘c’
        System.out.println("h. Does list contain 'c'? " + list.contains("c"));

        // i. Replace the items individually with the following: j, a, v, a
        list.set(0, "j");
        list.set(1, "a");
        list.set(2, "v");
        list.set(3, "a");

        System.out.print("i. Final list after replacements: ");
        list.print();
    }
}