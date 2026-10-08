package figurasgeometricas;

public class Cuadrado {
        
    double lado;
    
    Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcArea() {
        return Math.pow(lado,2);
    }
    
    double calcPerimetro() {
        return 4*lado;
    }
}
