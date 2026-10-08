package cuentasbancarias;

public class CuentaBancaria {
    String nombre;
    String apellido;
    int noCuenta;
    enum tipo {AHORROS,CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    
    CuentaBancaria(String nombre,String apellido,int noCuenta,tipo tipoCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.noCuenta = noCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    
    void imprimir() {
        System.out.println("Nombre y apellido del titular: " + nombre + " " + apellido);
        System.out.println("Número de cuenta: " + noCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldo + " COP");   
    }
    
    void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo + " COP");
    }
    
    boolean consignar(float valor) {
    if (valor > 0) {
    saldo = saldo + valor;
    System.out.println("Se ha consignado: " + valor + " COP en la cuenta. El nuevo saldo es: " + saldo + " COP");
    return true;
    } 
    else {
    System.out.println("El valor a consignar debe ser mayor que cero");
    return false;
    }
    }
    
    boolean retirar(float valor) {
    if ((valor > 0) && (valor <= saldo)) {
    saldo = saldo - valor;
    System.out.println("Se ha retirado: " + valor + " COP de la cuenta. El nuevo saldo es: " + saldo + " COP");
    return true;
    } 
    else {
    System.out.println("El valor a retirar debe ser menor que el saldo actual");
    return false;
    }
    }
}
