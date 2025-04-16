package interfaz;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author Esteban
 */
public class InterfazApp extends JFrame{

    public InterfazApp(Controlador ctrl) {        
        panelInfo pnlInfo = new panelInfo();
        panelChat pnlC = new panelChat();
        panelEnvio pnlmsg = new panelEnvio(ctrl);
        
        this.setTitle("Personal Chat");
        this.setSize(400, 300);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(pnlInfo, BorderLayout.NORTH);        
        add(pnlC, BorderLayout.CENTER);
        add(pnlmsg,BorderLayout.SOUTH );
    }
   
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp(new Controlador());
     //   InterfazApp iApp = new InterfazApp (new Controlador());
        frmMain.setVisible(true);
    //    iApp.setVisible(true);
    }
    
}
