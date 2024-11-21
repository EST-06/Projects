package Aplications;

import Estudiantes.Estudiante;
import Estudiantes.RegistroEstudiantes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Bienvenido al sistema de becas.");

        while (flag) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese su nombre: ");
                String nombre = sc.nextLine().toLowerCase();
                System.out.print("Ingrese su contraseña: ");
                String contrasena = sc.nextLine();

                if (!registro.existeEstudiante(nombre)) {
                    System.out.println("Credenciales incorrectas. Intente nuevamente.");
                    continue;
                }

                Estudiante estudianteLogueado = registro.getEstudiante(nombre);
                if (!estudianteLogueado.getContrasena().equals(contrasena)) {
                    System.out.println("Contraseña incorrecta. Intente nuevamente.");
                    continue;
                }

                System.out.println("Bienvenido " + estudianteLogueado.getNombre());

                System.out.println("¿Desea conocer su promedio?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.print("Selecciona una opción: ");
                int opcionPromedio = sc.nextInt();

                if (opcionPromedio == 1) {
                    estudianteLogueado.mostrarPromedio();
                }

                System.out.println("¿Desea postularse para la beca?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.print("Selecciona una opción: ");
                int opcionBeca = sc.nextInt();

                if (opcionBeca == 1) {
                    estudianteLogueado.verificarBeca();
                }

                flag = false;
            } else {
                System.out.println("¡Hasta luego!");
                flag = false;
            }
        }
    }
}
