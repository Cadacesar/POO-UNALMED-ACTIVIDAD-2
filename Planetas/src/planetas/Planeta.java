
package planetas;

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masaKilogramos = 0;
    double volKilometros = 0;
    int diametroKilometros = 0;
    int distMediaSolMK = 0;
    enum tipoPlaneta {GASEOSO,TERRESTRE,ENANO}
    tipoPlaneta tipo;
    boolean observable = false;
    float periodoOrbital = 0;
    float periodoRotacion = 0;
        
    
    Planeta(String nombre, int cantidadSatelites, double masaKilogramos, double volKilometros, int diametroKilometros, int distMediaSolMK, tipoPlaneta tipo, boolean observable, float periodoOrbital, float periodoRotacion) {
       this.nombre = nombre;
       this.cantidadSatelites = cantidadSatelites;
       this.masaKilogramos = masaKilogramos;
       this.volKilometros = volKilometros;
       this.diametroKilometros = diametroKilometros;
       this.distMediaSolMK = distMediaSolMK;
       this.tipo = tipo;
       this.observable = observable;
       this.periodoOrbital = periodoOrbital;
       this.periodoRotacion = periodoRotacion;
    }
    
    void imprimir() {
       System.out.println("Nombre de planeta: " + nombre);
       System.out.println("Cantidad de satélites: " + cantidadSatelites);
       System.out.println("Masa del planeta: " + masaKilogramos + " kg");
       System.out.println("Volumen del planeta: " + volKilometros + " km³");
       System.out.println("Diámetro del planeta: " + diametroKilometros + " km");
       System.out.println("Distancia al sol: " + distMediaSolMK + " millones de km");
       System.out.println("Tipo de planeta: " + tipo);
       System.out.println("Es observable a simplevista: " + observable);
       System.out.println("Periodo orbital: " + periodoOrbital + " años");
       System.out.println("Periodo de rotación: " + periodoRotacion + " días");
    }
    
    double calcDensidad() {
        return masaKilogramos/volKilometros;
    }
    
    boolean exterior() {
        float limite = (float)(149597870*3.4);
        if (distMediaSolMK > limite){
            return true;
        } 
        else {
            return false;
        }   
    }
}
