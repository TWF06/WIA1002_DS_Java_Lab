package Q4;

public class Main {
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        bag1.add("a"); bag1.add("b"); bag1.add("c");

        BagInterface<String> bag2 = new ArrayBag<>();
        bag2.add("b"); bag2.add("b"); bag2.add("d"); bag2.add("e");
        
        BagInterface<String >result1=bag1.difference(bag2);
        Object []result1a=result1.toArray();
        System.out.print("Difference: ");
        for (Object s : result1a) {
            System.out.print(s + " ");
        }
        
        BagInterface<String >result2=bag2.difference(bag1);
        Object []result2a=result2.toArray();
        System.out.print("Difference: ");
        for (Object s : result2a) {
            System.out.print(s + " ");
        }
        // bag1.difference(bag2) -> [a, c] (one 'b' is removed)
        // bag2.difference(bag1) -> [b, d, e] (one 'b' is removed)
    }
}
