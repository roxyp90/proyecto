package Unidad2
import java.util.Scanner;

public class Practicacuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de la persona en dólares: ");
        double sueldo = scanner.nextDouble();

        if (sueldo > 3000) {
            System.out.println("Esta persona debe abonar impuestos.");
        } else {
            System.out.println("Esta persona no debe abonar impuestos.");
        }

        scanner.close();
    }
}