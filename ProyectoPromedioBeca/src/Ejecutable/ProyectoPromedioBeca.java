package Ejecutable;

import DataBase.FileManager;
import DataBase.SuperArrayBag;
import DataBase.UserData;

import java.io.IOException;

public class ProyectoPromedioBeca {

    public static void main(String[] args) {
        try {
            // Suponiendo que el archivo está en la ruta correcta
            SuperArrayBag<UserData> userBag = FileManager.fileLecture("src/data/data.txt");

            // Imprimir los datos de los usuarios
            FileManager.printUserData(userBag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
