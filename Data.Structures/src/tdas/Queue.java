package tdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Queue<T> implements Iterable<T> {
    private T[] array;
    private int count;
    private int first;
    private int last;

    public Queue() {
        array = (T[]) new Object[1];
        count = 0;
        first = 0;
        last =  0;
    }
    
    public void enQueue(T item){        

        if (count == array.length) {
            reSize(array.length*2);
        } 
        int pos = last % array.length; 
        array[pos] = item;
        last ++;
        count++;
    }
    
    public T deQueue(){
        if (isEmpty()) {
            return null; 
        }
        
        T item = array[first];
        array[first] = null;
        first = (first + 1)% array.length;                
        count--;
        
        if (count == array.length/3) {
            reSize(array.length/2);
        }
        return item;
    }
    
    private void reSize(int newSize){
        T[] altArray = (T[]) new Object[newSize];
        for (int i = 0; i < count; i++) {
           altArray[i] = array[(first + i)% array.length];           
        }
        array = altArray;
        first = 0;
        last = count;
    }
    
    public T peak(){
        return array[first];
    }
    
    public boolean isEmpty(){
        return count == 0;
    }
    
    public int size(){
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }
    private class QIterator implements Iterator<T>{        
        
        @Override
        public boolean hasNext() {
            return first != last;
        }

        @Override
        public T next() {
            return array[first++ %array.length];
        }
        
    }
    
}
