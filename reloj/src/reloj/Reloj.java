package reloj;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Cambios;

/**
 *
 * @author Esteban
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {3, 1, 4, 7, 5, 2, 8, 6};
        Cambios ctm = new Cambios(arreglo);
        SearchStateSpaces ia = new SearchStateSpaces("12345678", ctm, 3);

        ArrayList<String> solucion = ia.solve();

        System.out.println("Pasos: " + ia.steps());
        for (String paso : solucion) {
            System.out.println(paso);
        }

    }

}
