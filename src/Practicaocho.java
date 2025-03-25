import java.util.Scanner;

public class Practicaocho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPreguntas, correctas;
        double porcentaje;

        System.out.print("Ingresa la cantidad total de preguntas: ");
        totalPreguntas = scanner.nextInt();

        System.out.print("Ingresa la cantidad de preguntas correctas: ");
        correctas = scanner.nextInt();

        porcentaje = (double) correctas / totalPreguntas * 100;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo.");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio.");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular.");
        } else {
            System.out.println("Fuera de nivel.");
        }

        scanner.close();
    }
}
