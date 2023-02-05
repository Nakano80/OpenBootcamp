/*public class Main {
    public static void main(String[] args) {
        vehiculo auto=new vehiculo();
        auto.setTipo("Automóvil");
        System.out.println(auto.getTipo());

        vehiculo moto=new vehiculo();
        moto.setTipo("Motocicleta");
        System.out.println(moto.getTipo());

    }
}

class vehiculo{
    private String tipo;

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return tipo;
    }
}*/
public class Main {
    public static void main(String[] args) {
        vehiculo auto = new vehiculo();
        System.out.println("El vehiculo tiene "+auto.ruedas+" Ruedas "+auto.puerta+" Puertas y Asientos de "+
        auto.tipodeAsientos("Tela"));

        Omnibus bus=new Omnibus();
        System.out.println("El Omnibus tiene asientos de "+bus.tipodeAsientos("Plástico")+" y es de la marca "+bus.marcaDeVehiculo("Mercedez Benz"));
    }
}

class vehiculo{
    int ruedas=4;
    int puerta=5;
    String combustible="Diesel";

    public String tipodeAsientos(String asientos){
        return asientos;
    }
}

class Omnibus extends vehiculo{
    public String marcaDeVehiculo(String marca){
        return marca;
    }
}
