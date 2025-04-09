import java.util.Scanner;

public class Ejerciciotres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double[] notas = new double[5];
        
        
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Introduce la nota " + (i + 1) + " (entre 0 y 10): ");
                double nota = scanner.nextDouble();
                
                
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    break; // Salir del bucle si la nota es válida
                } else {
                    System.out.println("La nota debe estar entre 0 y 10. Intenta nuevamente.");
                }
            }
        }
        
        
        double suma = 0;
        double maxNota = notas[0];
        double minNota = notas[0];
        
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
            if (notas[i] > maxNota) {
                maxNota = notas[i];
            }
            if (notas[i] < minNota) {
                minNota = notas[i];
            }
        }
        
        double media = suma / 5;
        
        
        System.out.println("\nNotas introducidas:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        
        System.out.printf("\nNota media: %.2f\n", media);
        System.out.println("Nota más alta: " + maxNota);
        System.out.println("Nota más baja: " + minNota);
        
        scanner.close();
    }
}
