public class Main {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println(miCoche.puertas);
        int param1 = 1;
        int param2 = 2;
        int param3 = 3;
        int valor = suma(param1, param2, param3);
        System.out.println(valor);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void AddPuertas() {
        this.puertas++;
    }
}
