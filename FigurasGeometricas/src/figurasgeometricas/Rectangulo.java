package figurasgeometricas;

public class Rectangulo {
        
    double baseR;
    double alturaR;
    
    Rectangulo(double baseR, double alturaR) {
        this.baseR = baseR;
        this.alturaR = alturaR;
    }
    double calcArea() {
        return baseR*alturaR;
    }
    
    double calcPerimetro() {
        return (2*baseR) + (2*alturaR);
    }
}
