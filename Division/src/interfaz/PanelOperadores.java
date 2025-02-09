package interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class PanelOperadores extends JPanel {
    
    private JRadioButton d_Real, modulo, cociente;

    public PanelOperadores() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Operandores")));
        setLayout(new GridLayout(1, 3));
        setPreferredSize(new Dimension(400, 75));          
        Options();
    }
    
    public void Options(){
        
        d_Real = new JRadioButton("Division Real");
        add(d_Real);
        
        modulo = new JRadioButton("Modulo");        
        add(modulo);
        
        cociente = new JRadioButton("Cociente");
        add(cociente);
        
    }
    
    
    
}
