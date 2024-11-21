package Proxy;

import Estudiantes.Estudiante;

/**
 * autor: Esteban
 */
public class Proxy extends Subject {
    private ConcreteSubject concreteSubject;

    public Proxy() {
        concreteSubject = new ConcreteSubject();
    }

    @Override
    public void verificarAcceso(Estudiante estudiante, String accion) {
        System.out.println("Accediendo al sistema de becas como " + estudiante.getNombre() + "...");

        switch (accion.toLowerCase()) {
            case "calcularpromedio":
                concreteSubject.mostrarPromedio(estudiante);
                break;
            case "verificarbeca":
                concreteSubject.verificarBeca(estudiante);
                break;
            default:
                System.out.println("Acción no reconocida.");
                break;
        }
    }
}

