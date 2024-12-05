package arrraylist;
import java.util.Scanner;
import tdas.*;

/**
 *
 * @author Esteban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<Integer>();
        Scanner key = new Scanner(System.in);
        boolean flag = true;
        int opcion;
        
        while(flag){
            System.out.println("1.Agregar dato (index - info)\n2.Mostrar arreglon\n3.Salir");
            opcion = key.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("idex");
                    int index = key.nextInt();
                    System.out.println("info");
                    int info = key.nextInt();
                    lista.add(index - 1, info);
                    break;
                case 2:
                    System.out.println(lista.showArray());
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }
    
}
