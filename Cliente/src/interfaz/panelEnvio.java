package interfaz;

import controlador.Controlador;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class panelEnvio extends JPanel {

    public panelEnvio(Controlador ctrl) {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new FlowLayout());
        mensaje();
        botoncito(ctrl);
    }

    public void mensaje() {
        JTextArea msg = new JTextArea(2,20);
        //msg.setPreferredSize(new Dimension(300, 30));
        add(msg);

    }

    public void botoncito(Controlador ctrl) {
       JButton enviar = new JButton("send");
       
       enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrl.ejecucion();
            }
        });
       add(enviar);
    }
    

}
