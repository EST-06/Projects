package Functions;

import Abstract_Code.verifier;
import DataBase.UsersData;

public class logVerifier extends verifier {

    UsersData us = new UsersData();  // Accedemos a los datos

    @Override
    public boolean isOk(int index, int secIndex) {
        // Verificamos que los índices sean válidos para el nombre y la contraseña
        if (index < 0 || index >= us.getNames().size() || secIndex < 0 || secIndex >= us.getPas().size()) {
            System.out.println("Índice fuera de rango: index=" + index + ", secIndex=" + secIndex);
            return false;  // Si el índice es inválido, devolvemos false
        }

        // Imprimir los valores de los índices para depuración
        System.out.println("Verificando usuario con index=" + index + " y secIndex=" + secIndex);

        // Comprobamos que el nombre y la contraseña coincidan
        String storedName = us.getNames().get(index);
        String storedPassword = us.getPas().get(secIndex);

        System.out.println("Nombre almacenado: " + storedName);
        System.out.println("Contraseña almacenada: " + storedPassword);

        // Usamos equals() para verificar si las cadenas son exactamente iguales
        if (storedName.equals(us.getNames().get(index)) && storedPassword.equals(us.getPas().get(secIndex))) {
            return true;  // Si coinciden, es válido
        } else {
            System.out.println("Nombre o contraseña incorrectos");
            return false;  // Si no coinciden, devolvemos false
        }
    }
}
