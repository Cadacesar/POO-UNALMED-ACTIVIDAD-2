package automoviles;

public class Automovil {
    String marca = null;
    int modelo = 0;
    double motor = 0;
    enum tipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    tipoCombustible tipoComb;
    enum tipoAutomovil {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoAutomovil tipoAuto;
    int noPuertas = 0;
    int cantidadAsientos = 0;
    double velMax = 0;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    double velAct = 0;
    
    Automovil(String marca,int modelo,double motor,tipoCombustible tipoComb,tipoAutomovil tipoAuto,int noPuertas,int cantidadAsientos,double velMax,tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoComb = tipoComb;
        this.tipoAuto = tipoAuto;
        this.noPuertas = noPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velMax = velMax;
        this.color = color; 
    }
    
    String getMarca() {
        return marca;
    }
   
    int getModelo() {
        return modelo;
    }
    
    double getMotor() {
        return motor;
    }
    
    tipoCombustible getTipoCombustible() {
        return tipoComb;
    }
    
    tipoAutomovil getTipoAutomovil() {
        return tipoAuto;
    }
    
    int getNoPuertas() {
        return noPuertas;
    }
    
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    
    double getVelMax() {
        return velMax;
    }
    
    tipoColor getColor() {
        return color;
    }
    
    double getVelAct() {
        return velAct;
    }
    
    void setMarca(String marca) {
        this.marca = marca;
    }
    
    void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    void setMotor(double motor) {
        this.motor = motor;
    }
    
    void setTipoCombustible(tipoCombustible tipoComb) {
        this.tipoComb = tipoComb;
    }
    
    void setTipoAutomovil(tipoAutomovil tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
    
    void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
    
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    void setVelMax(double velMax) {
        this.velMax = velMax;
    }
    
    void setColor(tipoColor color) {
        this.color = color;
    }
    
    void setVelAct(double velAct) {
        this.velAct = velAct;
    }
    
    void acelerar(int incrementoVelocidad) {
        if ((velAct + incrementoVelocidad) < velMax) {
            velAct = velAct + incrementoVelocidad;
        }
        else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automovil");
        }
    }
    
    void desacelerar(int decrementoVelocidad) {
        if ((velAct - decrementoVelocidad) > 0) {
            velAct = velAct - decrementoVelocidad;
        }
        else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }
    
    void frenar() {
        velAct = 0;
    }
    
    double calcularTiempoLlegada(double distancia) {
        return distancia/velAct;
    }
    
    void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindraje motor: " + motor + " l");
        System.out.println("Tipo de combustible: " + tipoComb);
        System.out.println("Tipo de auto: " + tipoAuto);
        System.out.println("Número de puertas: " + noPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad máxima: " + velMax + " km/h");
        System.out.println("Color: " + color);
    }
    
}
