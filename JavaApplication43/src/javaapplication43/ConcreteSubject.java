/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication43;

/**
 *
 * @author Esteban
 */
public class ConcreteSubject {
   
    public void verificarBeca(Estudiante estudiante) {
        System.out.println("Verificando beca para " + estudiante.getNombre() + "...");
        double promedio = estudiante.calcularPromedio();
        
        if (promedio >= 4.5) {
            System.out.println("El estudiante tiene un promedio de: " + promedio);
            if (estudiante instanceof EstudianteConBono) {
                double bono = ((EstudianteConBono) estudiante).obtenerBono();
                System.out.println("Bono del 5% otorgado. El promedio final es: " + (promedio * (1 + bono)));
            } else {
                System.out.println("El estudiante califica para la beca base de 15%.");
            }
        } else {
            System.out.println("El estudiante no califica para la beca.");
        }
    }
}
