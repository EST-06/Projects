package interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
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
    private ButtonGroup gBotones;

    public PanelOperadores() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Operandores")));
        setLayout(new GridLayout(1, 3));                
        options();
    }
    
    private void options(){
        gBotones = new ButtonGroup();
        
        d_Real = new JRadioButton("Division Real");
        add(d_Real);
        gBotones.add(d_Real);
        
        modulo = new JRadioButton("Modulo");        
        add(modulo);
        gBotones.add(modulo);
        
        cociente = new JRadioButton("Cociente");
        add(cociente);
        gBotones.add(cociente);        
    }
    
    public int selectedOptions(){
        if (d_Real.isSelected()) {
            return 0;
        }
        if (modulo.isSelected()) {
            return 1;
        }
        if (cociente.isSelected()) {
            return 2;
        }
        return 3;
    }
    

}
