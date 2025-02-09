package interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class PanelOperandos extends JPanel {
    private JTextField dividendo;
    private JTextField divisor;

    public PanelOperandos() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Operandos")));
        setLayout(new GridLayout(2, 2));
        setPreferredSize(new Dimension(400, 75));
        textFields();

    }

    public void textFields() {
        removeAll();

        JLabel etiqueta1 = new JLabel("Dividendo");
        add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Divisor");
        add(etiqueta2);

        dividendo = new JTextField("");
        add(dividendo);

        divisor = new JTextField("");
        add(divisor);
    }

    public JTextField getDividendo() {
        return dividendo;
    }

    public JTextField getDivisor() {
        return divisor;
    }

    public void setDividendo(JTextField dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(JTextField divisor) {
        this.divisor = divisor;
    }

    
}
