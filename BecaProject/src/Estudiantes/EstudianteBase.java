package Estudiantes;

public class EstudianteBase extends Estudiante {

    public EstudianteBase(String nombre, String contrasena, double[] notas) {
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

    @Override
    public boolean tieneBono() {
        return false; 
    }
}
