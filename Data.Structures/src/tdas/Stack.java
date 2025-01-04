/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Stack<T> implements Iterable<T>{
    T[] array;
    int count;
    
    public Stack(){
        array = (T[]) new Object[1];
        count = 0;
    }
    
    public void push(T item){
        if (isEmpty()) {
            return;
        }
        if (count == array.length) {
            reSize(array.length*2);
        }
        
        array[count] = item;
        count++;
    }
    
    public T pop(){
        if (isEmpty()) {
            return null;
        }
        T item = array[--count];
        array[count] = null;
        
        
        if (count == array.length/4) {
            reSize(array.length/2);
        }        
        return item;
    }
    
    private void reSize(int size){
        T[] tempArray = (T[]) new Object[size];
        for (int i = 0; i < count; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }
    
    public boolean isEmpty(){
        return count == 0;
    }
    

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }
    
    private class StackIterator implements Iterator<T>{
        
        private int i = count;

        @Override
        public boolean hasNext() {
            return count != array.length;
        }

        @Override
        public T next() {
            return array[--i];
        }

       
        
    }
    
}
