package tdas;

import java.util.Iterator;

/**
 *
 * @author Esteban
 * @param <T>
 */
public class ArrayList<T> implements Iterable<T> {

   
    private T[] superArray;
    private int count;

    /**
     * Constructor que inicializa el arreglo
     *
     */
    public ArrayList() {
        this.superArray = (T[]) new Object[1];
        this.count = 0;
    }

    /**
     * Desplaza los elementos a la derecha desde una posición dada.
     *
     * @param startPos Posición de inicio.
     * @param steps    Número de posiciones a desplazar.
     */
    private void shiftRight(int startPos, int steps) {
        if (!cuantityCheck(steps)) {
            resize(superArray.length * 2);
        }

        for (int i = count - 1; i >= startPos; i--) {
            superArray[i + steps] = superArray[i];
        }

        addOrSubstractCount(steps);
    }

    /**
     * Desplaza los elementos a la izquierda desde una posición dada.
     *
     * @param startPos Posición de inicio.
     * @param steps    Número de posiciones a desplazar.
     */
    private void shiftLeft(int startPos, int steps) {
        if (count + 1 == superArray.length / 4) {
            resize(superArray.length / 2);
        }

        for (int i = startPos; i < count; i++) {
            superArray[i - steps] = superArray[i];
        }

        addOrSubstractCount(-steps);
    }

    /**
     * Verifica si el desplazamiento es posible.
     *
     * @param steps Número de posiciones a desplazar.
     * @return true si el desplazamiento es posible.
     */
    private boolean cuantityCheck(int steps) {
        return count + steps < superArray.length && count + steps >= -1;
    }

    /**
     * Ajusta la cantidad de elementos en el arreglo.
     *
     * @param number Cantidad a ajustar.
     */
    private void addOrSubstractCount(int number) {
        count += number;
    }

    /**
     * Elimina datos residuales desde una posición dada.
     *
     * @param startPos Posición de inicio.
     */
    private void removeGarbage(int startPos) {
        for (int i = startPos; i < superArray.length; i++) {
            superArray[i] = null;
        }
    }

    /**
     * Elimina el elemento en la posición especificada.
     *
     * @param index Posición del elemento.
     * @return true si se eliminó con éxito, False si no se elimino.
     */
    public boolean removeIndex(int index) {
        if (index < 0 || index > count) {
            return false;
        }

        shiftLeft(index + 1, 1);
        removeGarbage(count);

        return true;
    }

    /**
     * Inserta un rango de números en una posición específica.
     *
     * @param pos   Posición de inserción.
     * @param range Arreglo de números a insertar.
     * @return true si se insertó con éxito, False si no fue exitoso.
     */
    public boolean insertRange(int pos, T[] range) {
        if (pos < 0 || pos > count) {
            return false;
        }

        shiftRight(pos, range.length);

        for (int i = 0; i < range.length; i++) {
            superArray[i + pos] = range[i];
        }
        return true;
    }

    /**
     * Crea una copia del arreglo.
     *
     * @return int[] Un nuevo arreglo con los mismos elementos.
     */
    public T[] clone() {
        T[] clone = (T[]) new Object[count];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = superArray[i];
        }
        return clone;
    }

    /**
     * Elimina un rango de elementos entre dos posiciones dadas.
     *
     * @param startPos Posición inicial.
     * @param endPos   Posición final.
     * @return true si se eliminó con éxito, False si no fue exitoso.
     */
    public boolean removeRange(int startPos, int endPos) {
        if (startPos < 0 || endPos > count || startPos > endPos) {
            return false;
        }

        shiftLeft(endPos + 1, endPos - startPos + 1);
        removeGarbage(count);

        return true;
    }

    /**
     * Inserta un número en la primera posición.
     *
     * @param item Dato a insertar.
     */
    public void addFirst(T item) {
        shiftRight(0, 1);
        superArray[0] = item;
    }

    /**
     * Elimina el elemento en la primera posicion.
     */
    public void removeFirst() {
        if (count == 0) {
            return;
        }
        shiftLeft(1, 1);
        removeGarbage(count);
    }

    /**
     * Elimina el elemento en la ultima posicion.
     */
    public void deleteLastPosition() {
        if (count == 0) {
            return;
        }
        superArray[count - 1] = null;
        addOrSubstractCount(-1);
    }

    /**
     * Inserta un número en una posición específica.
     *
     * @param index Posición de inserción.
     * @param value Número a insertar.
     */
    public void insertIndex(int index, T value) {
        if (index < 0 || index > count) {
            return;
        }

        shiftRight(index, 1);
        superArray[index] = value;
    }

    /**
     * Modifica el valor de un número en una posición específica.
     *
     * @param index Posición del número.
     * @param value Nuevo valor.
     */
    public void changeNum(int index, T value) {
        if (index < 0 || index > count) {
            return;
        }
        superArray[index] = value;
    }

    /**
     * Limpia el arreglo, eliminando todos los elementos.
     */
    public void clearArray() {
        removeGarbage(0);
        addOrSubstractCount(count);
    }

    /**
     * Elimina los duplicados del arreglo.
     */
    public void removeDuplicates() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                while (superArray[i] == superArray[j]) {
                    shiftLeft(j + 1, 1);

                    if (j == count) {
                        break;
                    }
                }
            }
        }
        removeGarbage(count);
    }

    /**
     * Muestra los elementos del arreglo hasta la cantidad actual.
     *
     * @return String Una cadena con los elementos hasta la cantidad actual.
     */
    public String displayArray() {
        String result = "Arreglo: [";
        for (int i = 0; i < count; i++) {
            result += superArray[i];
            if (i < count) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    /**
     * Añade un número al final del arreglo.
     *
     * @param value Número a añadir.
     */
    public void addLastPosition(T value) {
        if (!cuantityCheck(1)) {
            resize(superArray.length * 2);
        }
        superArray[count] = value;
        addOrSubstractCount(1);
    }

    /**
     * Verifica si el arreglo contiene un valor específico.
     *
     * @param value Valor a buscar.
     * @return true si el valor está presente, False si el valor no se
     *         encuentra.
     */
    public boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (superArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el arreglo está vacío.
     *
     * @return true si el arreglo está vacío, False si contiene mas de un valor.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Obtiene la cantidad de elementos en el arreglo.
     *
     * @return int Número de elementos en el arreglo.
     */
    public int size() {
        return count;
    }

    /**
     * Elimina todas las ocurrencias de un número específico en el arreglo.
     *
     * @param item Número cuyas ocurrencias se eliminarán.
     */
    public void allConcurrences(T item) {
        for (int i = 0; i < count; i++) {
            while (superArray[i] == item) {
                shiftLeft(i + 1, 1);
                if (i == count) {
                    break;
                }
            }
        }
        removeGarbage(count);
    }

    /**
     * Elimina la primera concurrencia de un número específico en el arreglo.
     *
     * @param number Número cuya primera ocurrencia se eliminará.
     */
    public void removeFirstConcurrecy(T number) {
        if (!contains(number)) {
            return;
        }
        removeIndex(searchNum(number));
        removeGarbage(count);
    }

    /**
     * Muestra una sección del arreglo desde una posición inicial hasta una
     * final.
     *
     * @param startPos Posición inicial.
     * @param endPos   Posición final.
     * @return String Una cadena con los elementos seleccionados o null si las
     *         posiciones son inválidas.
     */
    public String selectShow(int startPos, int endPos) {
        if (startPos < 0 || endPos > count || startPos > endPos) {
            return null;
        }

        String copyArray = "";
        for (int i = startPos; i <= endPos; i++) {
            copyArray += superArray[i] + " ";
        }

        return copyArray;
    }

    /**
     * Obtiene una submatriz del arreglo original entre dos posiciones dadas.
     *
     * @param startPos Posición inicial.
     * @param endPos   Posición final.
     * @return Una submatriz con los elementos seleccionados o null si las
     *         posiciones son inválidas.
     */
    public T[] chooseArray(int startPos, int endPos) {
        if (startPos < 0 || endPos > count || startPos > endPos) {
            return null;
        }

        T[] selectArray = (T[]) new Object[endPos - startPos + 1];

        for (int i = 0; i < selectArray.length; i++) {
            selectArray[i] = superArray[i + startPos];
        }
        return selectArray;
    }

    /**
     * Busca un número específico en el arreglo.
     *
     * @param index Número a buscar.
     * @return La posición del número en el arreglo, o (-1) si no se encuentra.
     */
    public int searchNum(T index) {
        for (int i = 0; i < count; i++) {
            if (superArray[i] == index) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Obtiene el elemento en la posición especificada.
     *
     * @param index Posición del elemento.
     * @return El elemento en la posición especificada.
     */
    public T get(int index) {
        return superArray[index];
    }

    /**
     * Redimensiona el arreglo.
     *
     * @param newSize Nuevo tamaño del arreglo.
     */
    private void resize(int newSize) {
        T[] aux = (T[]) new Object[newSize];
        for (int i = 0; i < count; i++) {
            aux[i] = superArray[i];
        }
        superArray = aux;
    }

    /**
     * Iterador para el arreglo.
     *
     * @return Un iterador para el arreglo.
     */
    @Override
    public Iterator<T> iterator() {
        return new SuperArrayIterator();
    }

    /**
     * Clase interna que implementa un iterador para el arreglo.
     */
    private class SuperArrayIterator implements Iterator<T> {

        private int i = 0;

        /**
         * Verifica si hay un siguiente elemento en el arreglo.
         */
        @Override
        public boolean hasNext() {
            return i < count;

        }

        /**
         * Retorna el siguiente elemento del arreglo.
         */
        @Override
        public T next() {
            return superArray[i++];
        }

    }

}