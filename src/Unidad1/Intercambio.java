package Unidad2
public class Intercambio {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después del intercambio (sin éxito):");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Dentro del método intercambiar:");
        System.out.println("x = " + x + ", y = " + y);
    }
}
