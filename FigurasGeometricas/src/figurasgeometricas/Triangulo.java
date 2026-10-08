package figurasgeometricas;

public class Triangulo {
            
    double baseT;
    double alturaT;
    
    Triangulo(double baseT, double alturaT) {
        this.baseT = baseT;
        this.alturaT = alturaT;
    }
    double calcArea() {
        return baseT*alturaT/2;
    }
    
    double calcPerimetro() {
        return baseT + alturaT + calcHipotenusa();    
    }
    
    double calcHipotenusa() {
        return Math.pow(baseT*baseT + alturaT*alturaT, 0.5);
    }
    
    void detTipoTriang() {
    if ((baseT == alturaT) && (baseT == calcHipotenusa()) && (alturaT
    == calcHipotenusa()))
    System.out.println("Es un triángulo equilátero");
    else if ((baseT != alturaT) && (baseT != calcHipotenusa()) &&
    (alturaT != calcHipotenusa()))
    System.out.println("Es un triángulo escaleno");
    else
    System.out.println("Es un triángulo isósceles");
    }
}
