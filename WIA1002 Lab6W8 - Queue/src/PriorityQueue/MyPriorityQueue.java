import java.util.Comparator;
import java.util.Collections;
import java.util.PriorityQueue;

public class MyPriorityQueue<E extends Comparable>{
    //private pq
    private PriorityQueue<E> pq;
    
    //default constructor
    public MyPriorityQueue (){
        pq = new PriorityQueue<>();
    }
    
    //Max Priority constructor
    public MyPriorityQueue(boolean maxPrio){
        if(maxPrio)
            pq= new PriorityQueue<>(Collections.reverseOrder());
        else
            pq= new PriorityQueue<>();
    }
    
    //ADT methods
    public void add(E e) {
        pq.add(e);
    }

    public E poll() {
        return pq.poll();
    }

    public E peek() {
        return pq.peek();
    }

    public int size() {
        return pq.size();
    }

    public boolean contains(E e) {
        return pq.contains(e);
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public Object[] toArray() {
        return pq.toArray();
    }

    @Override
    public String toString() {
        return pq.toString();
    }
}
