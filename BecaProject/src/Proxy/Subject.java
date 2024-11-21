package Proxy;

import Estudiantes.Estudiante;

/**
 * autor: Esteban
 */
public abstract class Subject {
    public abstract void verificarAcceso(Estudiante estudiante, String accion);
}
