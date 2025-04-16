/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class panelInfo extends JPanel {
    private JTextField direccion;
    private JTextField nick;

    public panelInfo() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new FlowLayout());        
        JLabel ip = new JLabel("IP:");
        add(ip);
        direccionIP();
        JLabel wawa = new JLabel("Nick:");
        add(wawa);
        nickName();
        
    }
    public void direccionIP(){
        direccion = new JTextField("",10); 
        add(direccion);
    }
    public void nickName(){
         nick = new JTextField("",10); 
        add(nick);
    }

    public JTextField getDireccion() {
        return direccion;
    }

    public JTextField getNick() {
        return nick;
    }
    
    
}
