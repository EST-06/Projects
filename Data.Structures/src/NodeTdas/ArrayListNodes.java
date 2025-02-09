package NodeTdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class ArrayListNodes<T> implements Iterable<T> {

    Node first;
    Node last;
    int count;

    public ArrayListNodes() {
        first = null;
        last = null;
        count = 0;
    }

    private void addFirst(T item) {
        Node temp = first;
        first = new Node();

        first.item = item;
        first.next = temp;

        if (temp != null) {
            temp.prev = first;
        }

        if (temp == null) {
            last = first;
        }

        first.prev = last;
        last.next = first;
        count++;

    }

    private void addLast(T item) {
        Node temp = last;
        last = new Node();
        
        last.item = item;
        
        if (temp == null) {
            first = last;
        }else{
            last.prev = temp;
            temp.next = last;
        }
            first.prev = last;
            last.next = first;
            count++;
        
    }

    public void add(T item, int index) {
        if (index > count) {
            return;
        }

        if (index == 0) {
            addFirst(item);
            return;
        }

        if (index == count ) {
            addLast(item);
            return;
        }

        Node aux = getNode(index);
        Node temp = new Node();
        temp.item = item;

        temp.prev = aux.prev;
        temp.next = aux;

        aux.prev.next = temp;
        aux.prev = temp;
        count++;
    }

    public void addRange(T[] array, int starPos) {
        Node current;        
        Node oldNextCurrent;

        current = getNode(starPos);
        oldNextCurrent = current.next;

        for (int i = 0; i < array.length; i++) {
            Node temp = new Node();
            
            temp.item = array[i];
            temp.prev = current;
            current.next = temp;

            current = current.next;
            temp = temp.next;
        }

        current.next = oldNextCurrent;
        oldNextCurrent.prev = current;

        count += array.length;
    }

    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return count;
    }

    public String showList() {
        String array = "Lista [ ";
        Node current = first;
        for (int i = 0; i < count; i++) {
            array += current.item + " ";
            current = current.next;
        }
        array += "]";
        return array;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator();
    }

    private class NodeIterator implements Iterator<T> {

        int size = size();
        Node temp = first;

        @Override
        public boolean hasNext() {
            return count != 0;
        }

        @Override
        public T next() {
            size--;
            T item = temp.item;
            temp = temp.next;
            return item;
        }

    }

    private class Node {

        T item;
        Node next;
        Node prev;
    }
}
