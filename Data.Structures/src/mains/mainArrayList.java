package mains;
import java.util.Scanner;
import tdas.*;

/**
 *
 * @author Esteban
 */
public class mainArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* ArrayList lista = new ArrayList<Integer>();
        Scanner key = new Scanner(System.in);
        boolean flag = true;
        int opcion;
        
        while(flag){
            System.out.println("1.Agregar dato (index - info)"
                    + "\n2.Mostrar arreglon"
                    + "\n3.Salir"
                    + "\n4.Meter un arreglo"
                    + "\n5.Cambiar info de un index"
                    + "\n6.Eliminar primero"
                    + "\n7.Eliminar ultimo dato"
                    + "\n8.Tamaño"
                    + "\n9.Eliminar x dato"
                    + "\n10.Existencia de un dato"
                    + "\n11.Eliminar un conjunto"
                    + "\n12.Mostrar dato en posicion especifica"
                    + "\n13.Remover duplicados de una info especifica"
                    + "\n14.Remover todos los duplicados");
            
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
                case 6:                                        
                    lista.delete(0);
                    break;
                case 7:                     
                    lista.delete(lista.size() - 1);
                    break;
                case 8: 
                    System.out.println(lista.size());
                    break;
                case 9:
                    System.out.println("Ingrese el index a remplazar");
                    index = key.nextInt();
                    if (index == 0) {
                        System.out.println("Ese no");
                        break;
                    }
                    lista.delete(index - 1);
                    break;
                case 10:
                    System.out.println("Ingrese el dato que quiere verificar");
                    info = key.nextInt();
                    if (lista.cointains(info)) {
                        System.out.println("El dato esta");
                        break;
                    }
                    System.out.println("El dato no esta");
                    
                    break;
                case 11:
                    System.out.println("Desde donde");
                    index = key.nextInt();
                    System.out.println("Hasta donde");
                    int index2 = key.nextInt();
                    lista.deleteGroup(index - 1, index2 - 1);
                    break;
                case 12:
                    System.out.println("ingrese que posicion quiere conocer");
                    index = key.nextInt();
                    System.out.println(lista.exixtence(index - 1));                    
                   break;                   
                case 13:
                    System.out.println("Informacion a verificar");
                    info = key.nextInt();
                    lista.removeConcurrences(info);
                    break;
                case 14:
                    lista.removeAllConcurrences();
                    break;
                default:
                    System.out.println("Una opcion disponible por favor");
                    break;
                    
            }
        }*/
    }
    
}
