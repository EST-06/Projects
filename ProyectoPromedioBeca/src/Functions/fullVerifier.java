package Functions;

import Abstract_Code.verifier;
import DataBase.UsersData;

public class fullVerifier extends verifier {

    logVerifier lv;
    double grade = 4.5;
    UsersData us = new UsersData();  // Aquí accedes a los datos

    public fullVerifier() {
        lv = new logVerifier();  // Inicializas el logVerifier
    }

    @Override
    public boolean isOk(int index, int secIndex) {
        // Delegamos la validación básica de índices a logVerifier
        if (!lv.isOk(index, secIndex)) {
            return false; // Si logVerifier detecta un error, no seguimos adelante
        }

        // Agregamos lógica adicional, como el chequeo de promedio
        if (grade < 4.5) {
            return false; // Si el promedio no es suficiente, retornamos falso
        }

        // Si todo va bien, retornamos verdadero
        return true;
    }

    public void setAverageGrade(double grade) {
        this.grade = grade;  // Método para establecer el promedio
    }
}
