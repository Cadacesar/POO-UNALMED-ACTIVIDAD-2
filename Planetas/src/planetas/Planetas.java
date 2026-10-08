package planetas;

public class Planetas {

    public static void main(String[] args) {
        Planeta planetaT = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12724, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 1, 1);
        planetaT.imprimir();
        System.out.println("La densidad del planeta es: " + planetaT.calcDensidad());
        System.out.println("Es planeta exterior: " + planetaT.exterior());
        
        System.out.println("---");
        
        Planeta planetaJ = new Planeta("Júpiter", 97, 1.899E27, 1.4313E15, 139820, 750000000, Planeta.tipoPlaneta.GASEOSO, true, 12, 0.4167f);
        planetaJ.imprimir();
        System.out.println("La densidad del planeta es: " + planetaJ.calcDensidad());
        System.out.println("Es planeta exterior: " + planetaJ.exterior());
    }
}