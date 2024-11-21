package Proxy;

import Estudiantes.Estudiante;
import Beca.Beca;

/**
 * autor: Esteban
 */
public class ConcreteSubject {

    public void mostrarPromedio(Estudiante estudiante) {
        double promedio = estudiante.calcularPromedio();
        System.out.println("El promedio del estudiante " + estudiante.getNombre() + " es: " + promedio);
    }

    public void verificarBeca(Estudiante estudiante) {        
        double promedio = estudiante.calcularPromedio();
        boolean tieneBono = estudiante.tieneBono();

        Beca beca = new Beca();
        double porcentajeBeca = beca.calcularPorcentaje(promedio, tieneBono);

        if (porcentajeBeca > 0) {
            System.out.println("El estudiante " + estudiante.getNombre() + " califica para una beca del " + (porcentajeBeca * 100) + "%.");
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() + " no califica para una beca.");
        }
    }
}
