package Unidad2
import java.util.Scanner;

public class Practicaquince {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cargar los nombres de las personas
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        // Ordenar los nombres alfabéticamente
        String nombrePrimero, nombreSegundo;
        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            nombrePrimero = nombre1;
            nombreSegundo = nombre2;
        } else {
            nombrePrimero = nombre2;
            nombreSegundo = nombre1;
        }

        // Mostrar los nombres ordenados
        System.out.println("\nNombres ordenados alfabéticamente:");
        System.out.println(nombrePrimero);
        System.out.println(nombreSegundo);

        scanner.close();
    }
}
