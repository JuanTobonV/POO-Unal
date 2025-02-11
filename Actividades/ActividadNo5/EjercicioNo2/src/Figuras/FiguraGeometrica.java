package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Clase base para las figuras geométricas
public class FiguraGeometrica {
    private double volumen;
    private double superficie;
    
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public double getVolumen() {
        return this.volumen;
    }
    
    public double getSuperficie() {
        return this.superficie;
    }
}
