public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        cliente.edad=42;
        cliente.nombre="Alex";
        cliente.telefono="923904019";
        cliente.credito=5000;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    float credito;
}

class Trabajador extends Persona{
    float salario;
}
