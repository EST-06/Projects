package interfaz;

import javax.swing.JFrame;

/**
 *
 * @author Esteban
 */
public class InterfazApp extends JFrame{
    panelBotones pnlB = new panelBotones();
    panelVidas pnlV = new panelVidas();

    public InterfazApp() {
        this.setLayout(null);
        
        this.setTitle("Nonograma");
        this.setSize(500, 500);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlB.setBounds(100, 100, 300, 300);
        add(pnlB);
        
        pnlV.setBounds(190, 10, 120, 40);
        add(pnlV);
    }

    
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp();
        frmMain.setVisible(true);
    }
  
}
