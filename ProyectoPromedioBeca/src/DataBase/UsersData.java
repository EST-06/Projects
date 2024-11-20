package DataBase;

import java.io.*;


public class UsersData {

   private SuperArrayBag<String> names, pas,grades;
   private String[] temp;

    public UsersData() {
        names = new SuperArrayBag<>();
        pas = new SuperArrayBag<>();
        grades = new SuperArrayBag<>();     
        temp = new String[30];
    }
    
    private void fillBags() throws IOException{
        try{
            FileManager.fileLecture("Names", temp);
            for(String element: temp){
                names.add(element);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);        
        }
        
        try{
            FileManager.fileLecture("Grades", temp);
            for(String element: temp){
                grades.add(element);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);        
        }
        
        try{
            FileManager.fileLecture("paswords", temp);
            for(String element: temp){
                pas.add(element);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);        
        }
    }
   
   
}
