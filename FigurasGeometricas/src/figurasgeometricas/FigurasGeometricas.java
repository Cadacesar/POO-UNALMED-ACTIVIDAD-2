
package figurasgeometricas;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Circulo circ = new Circulo(2);
        Rectangulo rect = new Rectangulo(1,2);
        Cuadrado cuad = new Cuadrado(3);
        Triangulo triang = new Triangulo(3,5);
        System.out.println("Área del círculo:  " + circ.calcArea());
        System.out.println("Perímetro del círculo:  " + circ.calcPerimetro());
        System.out.println("---");
        System.out.println("Área del rectángulo:  " + rect.calcArea());
        System.out.println("Perímetro del rectángulo:  " + rect.calcPerimetro());
        System.out.println("---");
        System.out.println("Área del cuadrado:  " + cuad.calcArea());
        System.out.println("Perímetro del cuadrado:  " + cuad.calcPerimetro());
        System.out.println("---");
        System.out.println("Área del triángulo:  " + triang.calcArea());
        System.out.println("Perímetro del triángulo:  " + triang.calcPerimetro());
        triang.detTipoTriang();
    }
    
}
