package interfaz;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class PanelResultado extends JPanel {

    private JTextField resultado;

    public PanelResultado(Controlador ctrl) {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Resultado")));
        setLayout(new BorderLayout());
        resultado();
        button(ctrl);
        
    }
    
    public void resultado(){
        removeAll();        
        resultado = new JTextField("");
        resultado.setPreferredSize(new Dimension(250,45));
        resultado.setEditable(false);
        add(resultado, BorderLayout.WEST);  
        
        repaint();
    }
    
    public void button(Controlador ctrl){
        JButton execute = new JButton("Ejecutar");        
        add(execute, BorderLayout.EAST);                               
    }

    public void setResultado(JTextField resultado) {
        this.resultado = resultado;
    }
    
    

}
