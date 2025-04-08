import java.util.Scanner;

public class Practicanueve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }

        scanner.close();
    }
}
