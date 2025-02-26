package interfaz;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class panelVidas extends JPanel{
    private ImageIcon imagen1;
    private ImageIcon imagen2;
    private ImageIcon imagen3;
    
 public panelVidas() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new GridLayout(1,4, 2, 2));        

    }    
 
 public void vidas(){
     imagen1 = new ImageIcon();
 }
}
