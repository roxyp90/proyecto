package Unidad2
import java.util.Scanner;

public class Practicadiez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad del operario: ");
        int antiguedad = scanner.nextInt();

        double nuevoSueldo;

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                nuevoSueldo = sueldo * 1.20; 
                System.out.println("El nuevo sueldo es: " + nuevoSueldo);
            } else {
                nuevoSueldo = sueldo * 1.05; 
                System.out.println("El nuevo sueldo es: " + nuevoSueldo);
            }
        } else {
            System.out.println("El sueldo del operario es: " + sueldo);
        }

        scanner.close();
    }
}