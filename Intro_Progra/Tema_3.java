public class Tema_3 {
    public static void main(String[] args) {
        int resultado=0;
        resultado=suma(4,15,6);

        Coche Toyota = new Coche();
        System.out.println(Toyota.SumaPuertas());
    }

    public static int suma(int a,int b,int c){
        return a+b+c;
    }

}
class Coche{
    public int puertas=2;

    public static void SumaPuertas(){
        this.puertas++;
    }
}