/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplications;

/**
 *
 * @author Esteban
 */
import Estudiantes.Estudiante;
import Estudiantes.RegistroEstudiantes;
import Proxy.Proxy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RegistroEstudiantes registro = new RegistroEstudiantes();
        boolean flag = true;

        Proxy proxy = new Proxy();

        Scanner sc = new Scanner(System.in);
        String nombre, contrasena;

        System.out.println("Bienvenido al sistema de becas.");

        while (flag) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print("Ingrese su nombre: ");
                nombre = sc.nextLine().toLowerCase();
                System.out.print("Ingrese su contraseña: ");
                contrasena = sc.nextLine();

                if (!registro.existeEstudiante(nombre)) {
                    System.out.println("Credenciales incorrectas. No se puede acceder al sistema.");
                    continue;
                }

                Estudiante estudianteLogueado = registro.getEstudiante(nombre);

                if (!estudianteLogueado.getContrasena().equals(contrasena)) {
                    System.out.println("Credenciales incorrectas. No se puede acceder al sistema.");
                    continue;
                }

                System.out.println("Bienvenido " + estudianteLogueado.getNombre());

                System.out.println("¿Desea postularse a la beca?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.print("Selecciona una opción: ");
                int postularOpcion = sc.nextInt();

                if (postularOpcion == 1) {
                    proxy.verificarBeca(estudianteLogueado); 
                }
                flag = false;
            } else {
                System.out.println("¡Hasta luego!");
                break;
            }
        }
    }
}
