import java.util.Scanner;

public class Practicacinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número (distinto al primero): ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números deben ser distintos.");
        } else {
            int numeroMayor;
            if (numero1 > numero2) {
                numeroMayor = numero1;
            } else {
                numeroMayor = numero2;
            }
            System.out.println("El número mayor es: " + numeroMayor);
        }

        scanner.close();
    }
}
    

