package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VentanaPiramide extends JFrame implements ActionListener {
    private JTextField campoBase, campoAltura, campoApotema;
    private JLabel volumen, superficie;
    private JButton calcular;
    
    public VentanaPiramide() {
        setTitle("Pirámide");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));
        
        add(new JLabel("Base:"));
        campoBase = new JTextField(15);
        add(campoBase);
        
        add(new JLabel("Altura:"));
        campoAltura = new JTextField(15);
        add(campoAltura);
        
        add(new JLabel("Apotema:"));
        campoApotema = new JTextField(15);
        add(campoApotema);
        
        calcular = new JButton("Calcular");
        calcular.addActionListener(this);
        add(calcular);
        
        volumen = new JLabel("Volumen:");
        add(volumen);
        
        superficie = new JLabel("Superficie:");
        add(superficie);
    }
    
    public void actionPerformed(ActionEvent e) {
        double base = Double.parseDouble(campoBase.getText());
        double altura = Double.parseDouble(campoAltura.getText());
        double apotema = Double.parseDouble(campoApotema.getText());
        Piramide piramide = new Piramide(base, altura, apotema);
        volumen.setText("Volumen: " + piramide.getVolumen());
        superficie.setText("Superficie: " + piramide.getSuperficie());
    }
}
