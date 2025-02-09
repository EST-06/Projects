package interfaz;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Esteban
 */
public class InterfazApp extends JFrame {
    
    private PanelOperandos operandos;
    private PanelOperadores operadores;
    
    public InterfazApp() {
        operandos = new PanelOperandos();
        operadores = new PanelOperadores();
        
        this.setLayout(null);
        
        this.setTitle("Division");
        this.setSize(500, 300);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        operandos.setBounds(10, 10, 450, 80);
        add(operandos);
                
        operadores.setBounds(10, 92, 450, 60);
        add(operadores);
        
        //add(operandos, BorderLayout.NORTH);
        //add(operadores, BorderLayout.NORTH);
    }
    
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp();
        frmMain.setVisible(true);
    }
    
}
