package Q2;

public class Main {
    public static void main(String[]args){
        BagInterface<String> bag1 = new ArrayBag<>();
        bag1.add("a"); bag1.add("b"); bag1.add("c");

        BagInterface<String> bag2 = new ArrayBag<>();
        bag2.add("b"); bag2.add("b"); bag2.add("d"); bag2.add("e");

        BagInterface<String> everything = bag1.union(bag2);
        Object []test = everything.toArray();
        for(Object s:test){
            System.out.print(s);
        }
    }
}
