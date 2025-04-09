import java.util.Scanner;

public class Ejerciciosiete {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce los valores para el vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        
        System.out.println("Introduce los valores para el vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

    
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("\nVector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector1[i] + " ");
        }

        System.out.println("\nVector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector2[i] + " ");
        }

        System.out.println("\nVector3 (Suma de vector1 y vector2):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector3[i] + " ");
        }

        scanner.close();
    }
}
