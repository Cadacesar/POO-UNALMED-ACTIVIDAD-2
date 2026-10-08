package registropersonas;

public class Persona {
    String nombre; //Nombre de la persona
    String apellido; //Apellido de la persona
    String documento; //Documento de identidad de la persona
    int anoNacimiento; //Año de nacimiento de la persona
    String paisNacimiento; //Indica el país de nacimiento de la persona
    char genero; //Indica el género de nacimiento de la persona
    
    //Método constructor para un objeto persona
    Persona (String nombre, String apellido,String documento,int anoNacimiento, String paisNacimiento, char genero) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.documento = documento;
            this.anoNacimiento = anoNacimiento;
            this.paisNacimiento = paisNacimiento;
            this.genero = genero;
    }
    
    //Método imprimir para imprimir la información de las personas
    void imprimir () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento de identidad: " + documento);
        System.out.println("Año de nacimiento: " + anoNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género nacimiento: " + genero);
    }
}
