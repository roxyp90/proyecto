package Unidad2
public class Valor {

    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Valor original de x: " + x);

        incrementar(x);
        System.out.println("Después de llamar a incrementar(x) sin guardar el valor: " + x);

        x = incrementar(x);
        System.out.println("Después de llamar a incrementar(x) y guardar el resultado: " + x);
    }
}
