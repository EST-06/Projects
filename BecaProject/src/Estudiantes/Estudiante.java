package Estudiantes;

import Beca.Beca;

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

    public void mostrarPromedio() {
        double promedio = calcularPromedio();
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }

    public void verificarBeca() {
        Beca beca = new Beca();
        double promedio = calcularPromedio();
        boolean tieneBono = tieneBono();

        double porcentajeBeca = beca.calcularPorcentaje(promedio, tieneBono);

        if (porcentajeBeca > 0) {
            System.out.println("El estudiante califica para una beca del " + (porcentajeBeca * 100) + "%.");
        } else {
            System.out.println("El estudiante no califica para una beca.");
        }
    }

   
    public abstract double calcularPromedio();

    public abstract boolean tieneBono();
}
