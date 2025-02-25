/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Esteban
 */
public class panelBotones extends JPanel {

    public panelBotones() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new GridLayout(10, 10, 2, 2));
        botones();

    }

    public void botones() {
        for (int fila = 0; fila < 10; fila++) {

            for (int columna = 0; columna < 10; columna++) {
                JButton execute = new JButton();
                execute.setBackground(Color.WHITE);
                
                //VERIFICAR LO SIGUIENTE
                int grosor = 2;
                int top = (fila % 5 == 0) ? grosor : 1;
                int left = (columna % 5 == 0) ? grosor : 1;
                int bottom = ((fila + 1) % 5 == 0) ? grosor : 1;
                int right = ((columna + 1) % 5 == 0) ? grosor : 1;
                execute.setBorder(new MatteBorder(top, left, bottom, right, Color.BLACK));                
                //HASTA ANTES
                
                add(execute);
            }
        }
    }
}
