package Beca;

public class Beca {
    public double calcularPorcentaje(double promedio, boolean tieneBono) {
        double porcentaje = 0;
        if (promedio >= 4.5) {
            porcentaje = 0.15; 
            if (tieneBono) {
                porcentaje += 0.05; 
            }
        }
        return porcentaje;
    }
}
