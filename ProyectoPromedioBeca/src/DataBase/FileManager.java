package DataBase;

import java.io.*;

public class FileManager {

    private static final String BASE_PATH = "src/data/";

    public static String[] fileLecture(String filename, String[] info) throws IOException {
        File file = new File(BASE_PATH + filename + ".txt");
        
        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            String reader = input.readLine();
            int index = 0;

            // Mientras haya líneas para leer
            while (reader != null) {
                if (index < info.length) {
                    info[index] = reader;  // Guarda la línea leída en el arreglo info
                    index++;
                } else {
                    // Si el arreglo se llena, puedes aumentar su tamaño o retornar un error
                    System.out.println("El archivo contiene más líneas de las que el arreglo puede manejar.");
                    break;
                }
                reader = input.readLine();  // Lee la siguiente línea
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return info;  // Retorna el arreglo con la información cargada
    }

}
