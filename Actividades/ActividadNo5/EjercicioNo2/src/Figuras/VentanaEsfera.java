package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VentanaEsfera extends JFrame implements ActionListener {
    private JTextField campoRadio;
    private JLabel volumen, superficie;
    private JButton calcular;
    
    public VentanaEsfera() {
        setTitle("Esfera");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        
        add(new JLabel("Radio:"));
        campoRadio = new JTextField(15);
        add(campoRadio);
        
        calcular = new JButton("Calcular");
        calcular.addActionListener(this);
        add(calcular);
        
        volumen = new JLabel("Volumen:");
        add(volumen);
        
        superficie = new JLabel("Superficie:");
        add(superficie);
    }
    
    public void actionPerformed(ActionEvent e) {
        double radio = Double.parseDouble(campoRadio.getText());
        Esfera esfera = new Esfera(radio);
        volumen.setText("Volumen: " + esfera.getVolumen());
        superficie.setText("Superficie: " + esfera.getSuperficie());
    }
}