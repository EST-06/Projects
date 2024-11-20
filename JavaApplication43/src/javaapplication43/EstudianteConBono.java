/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication43;

/**
 *
 * @author Esteban
 */
import java.util.Scanner;

public class EstudianteConBono extends Estudiante {

    public EstudianteConBono(String nombre, String contrasena, double[] notas) {
        super(nombre, contrasena, notas);
    }

    @Override
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : getNotas()) {
            suma += nota;
        }
        return suma / getNotas().length;
    }

    public double obtenerBono() {
        return 0.05; 
    }
}
