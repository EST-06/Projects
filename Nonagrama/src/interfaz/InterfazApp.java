package interfaz;

import javax.swing.JFrame;

/**
 *
 * @author Esteban
 */
public class InterfazApp extends JFrame{
    panelBotones pnlB = new panelBotones();

    public InterfazApp() {
        this.setLayout(null);
        
        this.setTitle("Nonograma");
        this.setSize(700, 700);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlB.setBounds(135, 200, 400, 400);
        add(pnlB);
    }

    
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp();
        frmMain.setVisible(true);
    }
  
}
