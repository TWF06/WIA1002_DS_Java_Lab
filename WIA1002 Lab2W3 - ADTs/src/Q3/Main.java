package Q3;

public class Main {
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        bag1.add("a"); bag1.add("b"); bag1.add("c");

        BagInterface<String> bag2 = new ArrayBag<>();
        bag2.add("b"); bag2.add("b"); bag2.add("d"); bag2.add("e");

        BagInterface<String> common = bag1.intersection(bag2);
        Object[] result = common.toArray();
        
        System.out.print("Intersection: ");
        for (Object s : result) {
            System.out.print(s + " ");
        }
        // Should print: b 
    }
}
