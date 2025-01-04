package arrraylist;

import java.util.Scanner;
import tdas.Queue;

/**
 *
 * @author Esteban
 */
public class mainQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue cola = new Queue<Integer>();
        Scanner key = new Scanner(System.in);
        boolean flag = true;
        int opcion;
        int dato;
        
        while(flag){
            System.out.println("1.Agregar dato "
                    + "\n2.Eliminar dato"                    
                    + "\n4.Meter un arreglo"                    
                    + "\n5.Tamaño"
                    + "\n6.Primer dato"
            );            
            opcion = key.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el dato");
                    dato = key.nextInt();
                    cola.enQueue(dato);
                    break;
                case 2:                    
                    System.out.println(cola.deQueue());
                    break;                
                case 4:                    
                    System.out.println("Tamaño");
                    dato = key.nextInt();
                    System.out.println("Ingrese los valores ");
                    for (int i = 0; i < dato; i++) {
                        cola.enQueue(key.nextInt());
                    }                    
                    break;
                case 5:
                    System.out.println(cola.size());
                    break;
                case 6:
                    System.out.println(cola.peak());
                    break;
            }
        }
    }
    
}
