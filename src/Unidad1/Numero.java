package Unidad2
    import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Validar que el número no sea negativo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;  // Se usa long por si el número es grande
            int i = 1;

            // Calcular factorial con while
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            // Mostrar el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}

