package registropersonas;

public class RegistroPersonas {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Carlos","Ceballos","1021589647", 2004, "Colombia", 'H');
        Persona p2 = new Persona ("Juliana", "Londoño", "458963257", 2002, "Eslovaquia", 'M');
        p1.imprimir();
        System.out.println("---");
        p2.imprimir();
       
    }
    
}
