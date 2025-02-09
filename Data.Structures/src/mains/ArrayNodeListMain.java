package mains;

import NodeTdas.ArrayListNodes;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ArrayNodeListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListNodes nodos = new ArrayListNodes<Integer>();
        boolean flag = true;

        while (flag) {
            System.out.println("1.Agregar dato"
                    + "\n2.Mostrar lista"
                    + "\n3 Tamaño"
                    + "\n4.Agregar un rango"/*
                    + "\n7.Eliminar ultimo dato"
                    + "\n8.Tamaño"
                    + "\n9.Eliminar x dato"
                    + "\n10.Existencia de un dato"
                    + "\n11.Eliminar un conjunto"
                    + "\n12.Mostrar dato en posicion especifica"
                    + "\n13.Remover duplicados de una info especifica"*/
                    + "\n14.salir");
            int opcion = sc.nextInt();
            int dato;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dato");
                    dato = sc.nextInt();
                    
                    System.out.println("En que posicion quier ingresar el dato");
                    System.out.println("1.Inicio"
                            + "\n2.Final"
                            + "\n3.Posicion especifica");
                    int pos = sc.nextInt();
                    switch (pos) {
                        case 1:
                            nodos.add(dato, 0);
                            break;
                        case 2:
                            nodos.add(dato, nodos.size());
                            break;
                        case 3:
                            System.out.println("Ingrese la posicion");
                            pos = sc.nextInt();
                            nodos.add(dato, pos - 1);
                            break;
                        default:
                            System.out.println("Pendejo");
                            break;
                    }
                    System.out.println("Ingresado");
                    break;
                case 2:
                    System.out.println(nodos.showList());
                    break;
                case 3:
                    System.out.println(nodos.size());
                    break;
                case 4:
                    Integer [] array;
                    System.out.println("Ingrese la cantidad de datos a ingresar");
                    array = new Integer[sc.nextInt()];
                    System.out.println("Ingrese los datos a ingresar");
                    for (int i = 0; i < array.length; i++) {
                        dato = sc.nextInt();
                        array[i] = dato;
                    }
                    System.out.println("Desde donde se deben ingresar los datos");
                    dato = sc.nextInt();
                    
                    nodos.addRange(array, dato);
                    break;
                case 14:
                    flag = false;
                    break;
                default:
                    System.out.println("Pendejo");
                    break;
            }
        }

    }

}
