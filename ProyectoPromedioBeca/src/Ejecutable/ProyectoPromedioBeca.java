package Ejecutable;

import Functions.fullVerifier;
import java.util.Scanner;


public class ProyectoPromedioBeca {

    public static void main(String[] args) {
        String name, pasword;
        fullVerifier fv = new fullVerifier();
        UserData ud = new UserData();
        Scanner key = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese el nombre y contraseña:");
        System.out.print("NOMBRE:");
        name = key.next();
        System.out.println("CONTRASEÑA:");
        pasword = key.next();
        
        if (fv.isOk(0, 0)) {
            
        }
        
        
        
        
    }
}
