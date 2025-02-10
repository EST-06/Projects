package controlador;

import interfaz.PanelOperadores;
import interfaz.PanelOperandos;
import interfaz.PanelResultado;
import javax.swing.JTextField;
import mundo.Dividir;

/**
 *
 * @author Esteban
 */
public class Controlador {
    private PanelResultado pnlResultado;
    private PanelOperandos pnlOperandos;
    private PanelOperadores pnlOperadores;
    private Dividir dividir;
    
    
    public Controlador() {
        this.pnlResultado = pnlResultado;
        this.pnlOperandos = pnlOperandos;
        this.pnlOperadores = pnlOperadores;
       
    }
    
    public boolean validation(String Tdividendo, String Tdivisor){
        try{
            double dividendo = Double.parseDouble(Tdividendo.trim());
            double divisor = Double.parseDouble(Tdivisor.trim());                        
        }catch (NumberFormatException e){
            return false;
        }
        
        if (true) {
            
        }
        
        return true;
    }
    
    
    
}
