package figurasgeometricas;

public class Circulo {
    
    double radio;
    
    Circulo(double radio) {
        this.radio = radio;
    }
    
    double calcArea() {
        return Math.PI*Math.pow(radio,2);
    }
    
    double calcPerimetro() {
        return 2*Math.PI*radio;
    }
}
