package tdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 * @param <T>
 */
public class ArrayList<T> implements Iterable<T> {

    private T[] array;
    private int count;

    public ArrayList() {
        array = (T[]) new Object[1];
        count = -1;
    }

    private void addFirst(T item) {
        shiftRight(0, 1);
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
        shiftRight( index, 1);
        array[index] = item;
    }
    
    public void addGroup(int index, T[] group){
        if (count + group.length  >= array.length - 1) {
            reSize(array.length * 2 + group.length);
        }
        
        shiftRight(index, group.length);
        for (int i = 0; i < group.length; i++) {
            array[i + index] = group[i];
        }
        count += group.length;
    
    }
    
    public boolean changeIndex (int index, T item){
        if (index > count) {
            return false;            
        }        
        array[index] = item;
        return true;
    }

    private void addLast(T item) {
        if (count == array.length - 1) {
            reSize(array.length * 2);
        }
        array[count + 1] = item;
        count++;
    }

    private void shiftRight(int index, int steps) {
        if (isEmpty()) {
            return;
        }
        if (count == array.length - 1) {
            reSize(array.length * 2);
        }      
        for (int i = count; i >= index; i--) {
            array[i + steps] = array[i];
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
