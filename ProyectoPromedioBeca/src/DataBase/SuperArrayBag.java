package DataBase;

import java.util.Iterator;

/**
 * Clase que implementa una bolsa de elementos genéricos usando un arreglo.
 * 
 * @param <T> Tipo de dato de los elementos a almacenar.
 */
public class SuperArrayBag<T> implements Iterable<T> {
    private T[] items;  
    private int count;  

    private static final int INITIAL_CAPACITY = 10;  

    /**
     * Constructor de la clase.
     */
    public SuperArrayBag() {
        
        items = (T[]) new Object[INITIAL_CAPACITY];
        count = 0;
    }

    /**
     * Método que agrega un elemento a la bolsa.
     * 
     * @param item Elemento a agregar.
     */
    public void add(T item) {
        
        if (count == items.length) {
            resize(items.length * 2);  
        }
        items[count++] = item;
    }

    /**
     * Verifica si la bolsa está vacía.
     * 
     * @return true si la bolsa está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Método que devuelve la cantidad de elementos en la bolsa.
     * 
     * @return Cantidad de elementos en la bolsa.
     */
    public int size() {
        return count;
    }

    /**
     * Método que devuelve un iterador para la bolsa.
     * 
     * @return Iterador para la bolsa.
     */
    @Override
    public Iterator<T> iterator() {
        return new SuperIterator();
    }

    /**
     * Redimensiona el arreglo para ajustarse al número de elementos.
     * 
     * @param capacity Nueva capacidad del arreglo.
     */
    private void resize(int capacity) {        
        T[] newItems = (T[]) new Object[capacity];
       
        for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
        }
       
        items = newItems;
    }

    /**
     * Clase interna que implementa un iterador para la bolsa.
     */
    private class SuperIterator implements Iterator<T> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < count;
        }

        @Override
        public T next() {
            return items[current++];
        }
    }
}
