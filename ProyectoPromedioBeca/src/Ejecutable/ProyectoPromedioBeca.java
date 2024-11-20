package Ejecutable;

import DataBase.UsersData;
import Functions.AverageGradeCalculator;
import Functions.fullVerifier;
import java.util.Scanner;

public class ProyectoPromedioBeca {

    public static void main(String[] args) {
        String name, pasword;
        Double averageGrade;
        fullVerifier fv = new fullVerifier();
        UsersData ud = new UsersData();
        Scanner key = new Scanner(System.in);
        AverageGradeCalculator grade = new AverageGradeCalculator();
        
        // Solicitar nombre y contraseña
        System.out.println("Ingrese el nombre y contraseña:");
        System.out.print("NOMBRE: ");
        name = key.next().toLowerCase();  // Asegurarse de que todo esté en minúsculas
        System.out.println("CONTRASEÑA: ");
        pasword = key.next();

        // Buscar el índice del nombre en la lista de nombres
        int student = ud.getNames().rank(name);  // Obtener el índice del nombre

        // Depuración: Verificar que el nombre está correctamente obtenido
        System.out.println("Índice del estudiante: " + student);
        System.out.println("Nombre en la lista: " + ud.getNames().get(student));
        
        // Verificar si el nombre y la contraseña coinciden en las listas
        if (student != -1 && ud.getNames().get(student).equals(name) && ud.getPas().get(student).equals(pasword)) {
            System.out.println("Bienvenido " + name);
        } else {
            System.out.println("Credenciales incorrectas.");
            return;  // Si las credenciales son incorrectas, salir del programa
        }
        
        // Menú de opciones
        System.out.println("1. Consultar Historial\n"
                + "2. Consultar Beca\n"
                + "3. Salir");

        int option = key.nextInt();
        
        switch(option){
            case 1:
                grade.calculator(student);
                averageGrade = grade.getAverageGrade();                         
                System.out.println("El promedio actual de la carrera es de: " + averageGrade);
                break;
            case 2:
                // Aquí puedes añadir más lógica para la consulta de la beca si es necesario
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

