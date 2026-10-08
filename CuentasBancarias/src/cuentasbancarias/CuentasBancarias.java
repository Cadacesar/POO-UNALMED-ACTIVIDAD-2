package cuentasbancarias;

public class CuentasBancarias {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Perez", 123456789, CuentaBancaria.tipo.AHORROS);
        cuenta1.imprimir();
        cuenta1.consignar(2000000);
        cuenta1.consignar(3000000);
        cuenta1.retirar(4000000);
        cuenta1.consultarSaldo();

    }
    
}
