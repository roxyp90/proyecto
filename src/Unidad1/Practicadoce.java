package Unidad2
import java.util.Scanner;

public class Practicadoce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int empleados100a300 = 0;
        int empleadosMas300 = 0;
        double totalSueldos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                empleados100a300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                empleadosMas300++;
            } else {
              System.out.println("El sueldo ingresado esta fuera del rango permitido");
              i--; 
              continue;
            }

            totalSueldos += sueldo;
        }

        System.out.println("Cantidad de empleados con sueldos entre $100 y $300: " + empleados100a300);
        System.out.println("Cantidad de empleados con sueldos mayores a $300: " + empleadosMas300);
        System.out.println("Importe total gastado en sueldos: $" + totalSueldos);

        scanner.close();
    }
}
