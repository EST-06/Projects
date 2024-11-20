package DataBase;

import java.io.*;


public class FileManager {

    private static final String BASE_PATH = "src/data/";

    public static String[] fileLecture( String filename, String[] info) throws IOException{
        File file = new File(BASE_PATH+filename+".txt");
        try{
            BufferedReader input = new BufferedReader(new FileReader(file));
            String reader = input.readLine();
            while(reader != null){
                String[]temp = new String[info.length];                
                int index = 0;
                for(String element: temp){                    
                    info[index] = element;
                    index++;
                }
                reader = input.readLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch( IOException ex){
            ex.printStackTrace(System.out);
        }
        return info;
                
    }

}