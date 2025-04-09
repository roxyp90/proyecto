package Unidad2;
import java.util.Random;

public class Ejerciciouno {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = rand.nextInt(10) + 1; 
        }

        for (int i = 0; i < vectorNumeros.length; i++) {
            int numero = vectorNumeros[i];
            int cuadrado = numero * numero; 
            int cubo = numero * numero * numero; 
            System.out.println("Valor: " + numero + ", Cuadrado: " + cuadrado + ", Cubo: " + cubo);
        }
    }
}
