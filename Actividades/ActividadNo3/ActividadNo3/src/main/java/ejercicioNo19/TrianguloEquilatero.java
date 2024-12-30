package ejercicioNo19;

/**
 *
 * @author juanv
 */
public class TrianguloEquilatero {
    int lado;

    public TrianguloEquilatero(int lado) {
        this.lado = lado;
    }
    
    double calcularArea(){
        return (Math.pow(lado, 2)) * Math.sqrt(3)/4;
    }
    
    double calcularAltura(){
        return lado * Math.sqrt(3)/2;
    }
    
    double calcularPerimetro(){
        return lado*3;
    }
    
    
}
