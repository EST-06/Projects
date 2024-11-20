/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication43;

/**
 *
 * @author Esteban
 */
public abstract class Estudiante {

    private String nombre;
    private String contrasena;
    private double[] notas;

    public Estudiante(String nombre, String contrasena, double[] notas) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena; 
    }

    public double[] getNotas() {
        return notas;
    }

    public abstract double calcularPromedio();
}
