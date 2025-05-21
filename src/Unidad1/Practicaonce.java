package Unidad2
import java.util.Scanner;

public class Practicaonce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayoresIguales7 = 0;
        int menores7 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            int nota = scanner.nextInt();

            if (nota >= 7) {
                mayoresIguales7++;
            } else {
                menores7++;
            }
        }

        System.out.println("Cantidad de notas mayores o iguales a 7: " + mayoresIguales7);
        System.out.println("Cantidad de notas menores a 7: " + menores7);

        scanner.close();
    }
}
