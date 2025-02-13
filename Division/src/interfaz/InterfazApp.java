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

    public InterfazApp() {
        pnlOperandos = new PanelOperandos();
        pnlOperadores = new PanelOperadores();
        pnlResultado = new PanelResultado();
    }

    public void interfazG(Controlador ctrl) {
        this.setLayout(null);

        this.setTitle("Division");
        this.setSize(500, 300);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlOperandos.setBounds(10, 10, 450, 80);
        pnlOperadores.setBounds(10, 92, 450, 50);
        pnlResultado.setBounds(10, 145, 450, 75);
        add(pnlOperandos);
        add(pnlOperadores);
        add(pnlResultado);

    }

    public PanelOperandos getPnlOperandos() {
        return pnlOperandos;
    }

    public PanelOperadores getPnlOperadores() {
        return pnlOperadores;
    }

    public PanelResultado getPnlResultado() {
        return pnlResultado;
    }

    public static void main(String[] args) {
        InterfazApp iApp = new InterfazApp();
        Controlador ctrl = new Controlador(iApp.pnlResultado, iApp.pnlOperandos, iApp.pnlOperadores);        
        iApp.interfazG(ctrl);
        iApp.pnlResultado.actionButton(ctrl);
        iApp.setVisible(true);
    }

}
