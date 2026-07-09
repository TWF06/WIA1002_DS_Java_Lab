package SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        // 1) Append values 
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy.");

        // 2) Display values 
        list.display();

        // 3) Remove "Linked list" and display removed value
        System.out.println("Removed: " + list.removeInitial());

        // 4) Check if 'difficult' is in the list 
        System.out.println("Contains 'difficult': " + list.contains("difficult"));

        // 5) Clear list 
        list.clear();
    }
}