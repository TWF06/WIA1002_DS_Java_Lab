package Q2;

import java.util.Arrays;

public class ArrayBag<T> implements BagInterface<T>{
    private T [] bag;
    private static final int DEFAULT_CAPACITY=25; 
    private int numberOfEntries;
    
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayBag(int capacity){
        numberOfEntries=0;
        bag =(T[]) new Object[capacity];
    }
    
    @Override
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull(){
        return numberOfEntries>=bag.length;
    }
    
    @Override
    public boolean isEmpty(){
        return numberOfEntries==0;
    }
    
    @Override
    public boolean add(T newEntry){
        if(isFull()||newEntry==null)
            return false;
        bag[numberOfEntries]=newEntry;
        numberOfEntries++;
        return true;
    }
    
    @Override
    public T remove(){
        if (isEmpty()) {
            return null;
        }
        T result = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
        return result;
    }
    
    @Override
    public boolean remove(T anEntry){
        int index = getIndexOf(anEntry);
        if (index > -1) {
            bag[index] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
            return true;
        }
        return false;
    }
    
    @Override
    public void clear(){
        while (!isEmpty()) {
            remove();
        }
    }
    
    @Override
    public int getFrequencyOf(T anEntry){
        int count = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public boolean contains(T anEntry){
        return getIndexOf(anEntry) > -1;
    }
    
    @Override
    public T[] toArray(){
        T[] result = (T[]) new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }
    
    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        int index = 0;

        while (!found && (index < numberOfEntries)) {
            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
            index++;
        }
        return where;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<T> otherBag) {
        int totalCapacity = this.getCurrentSize() + otherBag.getCurrentSize();
        BagInterface<T> everything = new ArrayBag<>(totalCapacity);
        T[] currentBagItems = this.toArray();
        for (T item : currentBagItems) {
            everything.add(item);
        }
        T[] otherItems = otherBag.toArray();
        for (T item : otherItems) {
            everything.add(item);
        }
        return everything;
    }
}
