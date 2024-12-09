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
            System.out.println("1.Agregar dato (index - info)"
                    + "\n2.Mostrar arreglon"
                    + "\n3.Salir"
                    + "\n4.Meter un arreglo"
                    + "\n5.Cambiar info de un index");
            
            opcion = key.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("idex");                   
                    int index = key.nextInt();
                    if (index == 0) {
                        System.out.println("Ese no");
                        break;
                    }
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
                case 4:
                    Integer[] arreglo;
                    System.out.println("Cuantos datos ingresara");
                    int tamaño = key.nextInt();
                    System.out.println("Desde donde los va a meter");
                    index = key.nextInt();
                    if (index == 0) {
                        System.out.println("Ese no");
                        break;
                    }
                    arreglo = new Integer[tamaño];
                    System.out.println("Ingrese los datos del nuevo arreglo");
                    for (int i = 0; i < tamaño; i++) {
                        arreglo[i] = key.nextInt();
                    }                    
                    lista.addGroup(index - 1, arreglo);
                    break;
                case 5: 
                    System.out.println("Ingrese el index a remplazar");
                    index = key.nextInt();
                    if (index == 0) {
                        System.out.println("Ese no");
                        break;
                    }
                    System.out.println("Y el item");
                    info = key.nextInt();
                    if (lista.changeIndex(index-1, info)) {
                        System.out.println("Se pudo");
                        break;
                    }
                    System.out.println("No s epudo");
                    break;
                default:
                    System.out.println("Una opcion disponible por favor");
                    break;
            }
        }
    }
    
}
