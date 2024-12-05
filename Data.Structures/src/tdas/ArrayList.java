package tdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class ArrayList<T> implements Iterable<T> {

    private T[] array;
    private int count;

    public ArrayList() {
        array = (T[]) new Object[1];
        count = -1;
    }

    private void addFirst(T item) {
        shiftRight(0);
        array[0] = item;
        count++;
    }
    
    public void add(int index, T item){
        if (index == 0) {
            addFirst(item);
            return;
        }
        if (index == count + 1 ) {
            addLast(item);
            return;
        }
        shiftRight( index);
        array[index] = item;
        
        
        
    }

    private void addLast(T item) {
        if (count == array.length - 1) {
            reSize(array.length * 2);
        }
        array[count + 1] = item;
        count++;
    }

    private void shiftRight(int steps) {
        if (isEmpty()) {
            return;
        }
        if (count == array.length - 1) {
            reSize(array.length * 2);
        }      
        for (int i = count; i >= steps; i--) {
            array[i + 1] = array[i];
        }

    }

    private void reSize(int size) {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i <= count ; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty() {
        return count == -1;
    }

    public String showArray() {
        String sArray = "Arreglo [ ";
        for (T item : array) {
            if (item == null) {
                break;
            }
            sArray += item + " ";

        }
        sArray += "]";
        return sArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public T next() {
            return array[index++];
        }
    }
}
