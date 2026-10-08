package automoviles;

public class Automoviles {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3,Automovil.tipoCombustible.DIESEL,Automovil.tipoAutomovil.EJECUTIVO,5,5,250,Automovil.tipoColor.AZUL);
        
        auto1.imprimir();
        auto1.setVelAct(100);
        System.out.println("Velocidad actual: " + auto1.velAct + " km/h");
        auto1.acelerar(20);
        System.out.println("Velocidad actual: " + auto1.velAct + " km/h");
        System.out.println("Tiempo de llegada para una distancia de 50 km: " + auto1.calcularTiempoLlegada(50) + " h");
        auto1.desacelerar(50);
        System.out.println("Velocidad actual: " + auto1.velAct + " km/h");
        auto1.frenar();
        System.out.println("Velocidad actual: " + auto1.velAct + " km/h");
        auto1.desacelerar(20);
    }
    
}
