/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VentanaPrincipal extends JFrame implements ActionListener {
    private JButton cilindro, esfera, piramide;
    
    public VentanaPrincipal() {
        setTitle("Figuras Geométricas");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        cilindro = new JButton("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
        add(cilindro);
        
        esfera = new JButton("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);
        add(esfera);
        
        piramide = new JButton("Pirámide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);
        add(piramide);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cilindro) {
            new VentanaCilindro().setVisible(true);
        } else if (e.getSource() == esfera) {
            new VentanaEsfera().setVisible(true);
        } else if (e.getSource() == piramide) {
            new VentanaPiramide().setVisible(true);
        }
    }
}
