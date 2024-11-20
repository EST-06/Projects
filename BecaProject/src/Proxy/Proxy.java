/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import Estudiantes.Estudiante;

/**
 *
 * @author Esteban
 */
public class Proxy {
    private ConcreteSubject concreteSubject;

    public Proxy() {
        concreteSubject = new ConcreteSubject();
    }

    public void verificarBeca(Estudiante estudiante) {        
        System.out.println("Verificando beca para " + estudiante.getNombre() + "...");        
        concreteSubject.verificarBeca(estudiante);
    }
}
