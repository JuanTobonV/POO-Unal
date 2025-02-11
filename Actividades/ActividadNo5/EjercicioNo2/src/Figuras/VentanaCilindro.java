package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VentanaCilindro extends JFrame implements ActionListener {
    private JTextField campoRadio, campoAltura;
    private JLabel volumen, superficie;
    private JButton calcular;
    
    public VentanaCilindro() {
        setTitle("Cilindro");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));
        
        add(new JLabel("Radio:"));
        campoRadio = new JTextField(15);
        add(campoRadio);
        
        add(new JLabel("Altura:"));
        campoAltura = new JTextField(15);
        add(campoAltura);
        
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
        double altura = Double.parseDouble(campoAltura.getText());
        Cilindro cilindro = new Cilindro(radio, altura);
        volumen.setText("Volumen: " + cilindro.getVolumen());
        superficie.setText("Superficie: " + cilindro.getSuperficie());
    }
}