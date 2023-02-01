public class Tema_4 {
    public static void main(String[] args) {
        int numeroIf = -0;
        int numeroWhile = 2;
        //int numeroFor=0;

        //IF//
        if (numeroIf < 0) System.out.println("El número es negativo");
        else if (numeroIf > 0) System.out.println("El número es positivo");
        else System.out.println("El número es cero");

        //WHILE//
        while (numeroWhile < 5) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DO WHILE//
        do {
            numeroWhile++;
            System.out.println("Do While: " + numeroWhile);
        } while (numeroWhile < 2);

        //BUCLE FOR//
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //SWITCH CASE//
        var estacion = "OTOÑO";

        switch (estacion) {
            case ("PRIMAVERA"):
                System.out.println("Es Primavera");
                break;
            case ("VERANO"):
                System.out.println("Es Verano");
                break;
            case ("INVIERNO"):
                System.out.println("Es Invierno");
                break;
            case ("OTOÑO"):
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Estación incorrecta");
        }
    }
}
