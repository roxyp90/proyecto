package Unidad2
public class Ejemploarrays {
    public static void main(String[] args) {
        // Declarar e inicializar el array de valores
        double[] precios = {12.5, 30.0, 7.8, 45.2, 22.9};

        // Imprimir los valores usando un bucle for
        System.out.println("Valores en el array:");
        for (int indice = 0; indice < precios.length; indice++) {
            System.out.println("Valor en la posición " + indice + ": " + precios[indice]);
        }

        // Modificar un valor en el array
        precios[2] = 15.5;

        // Imprimir el array modificado
        System.out.println("\nArray de valores modificado:");
        for (int posicion = 0; posicion < precios.length; posicion++) {
            System.out.println("Valor en la posición " + posicion + ": " + precios[posicion]);
        }
    }
}