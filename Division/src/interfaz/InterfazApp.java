package interfaz;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Esteban
 */
public class InterfazApp extends JFrame {
    
    private PanelOperandos pnlOperandos;
    private PanelOperadores pnlOperadores;
    private PanelResultado pnlResultado;
    
    public InterfazApp(Controlador ctrl) {
        pnlOperandos = new PanelOperandos();
        pnlOperadores = new PanelOperadores();
        pnlResultado = new PanelResultado(ctrl);
        
        this.setLayout(null);
        
        this.setTitle("Division");
        this.setSize(500, 300);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlOperandos.setBounds(10, 10, 450, 80);
        pnlOperadores.setBounds(10,92, 450, 50);
        pnlResultado.setBounds(10, 145, 450, 75);
        add(pnlOperandos);
        add(pnlOperadores);
        add(pnlResultado);
                
       
    }
    
    public static void main(String[] args) {
        Controlador ctrl = new Controlador();
        InterfazApp frmMain = new InterfazApp(ctrl);
        frmMain.setVisible(true);
    }
    
}
