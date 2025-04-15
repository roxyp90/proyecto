import java.util.Scanner;

public class TransporteConductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final int NUM_CONDUCTORES = 3;
        final int DIAS_SEMANA = 7;

        
        String[] nombres = new String[NUM_CONDUCTORES];
        int[][] kms = new int[NUM_CONDUCTORES][DIAS_SEMANA];
        int[] total_kms = new int[NUM_CONDUCTORES];

        
        for (int i = 0; i < NUM_CONDUCTORES; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese los kilómetros recorridos cada día por " + nombres[i] + ":");
            for (int j = 0; j < DIAS_SEMANA; j++) {
                System.out.print("  Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j]; 
            }
            scanner.nextLine(); 
        }

        System.out.println("\n--- Kilómetros Totales por Conductor ---");
        for (int i = 0; i < NUM_CONDUCTORES; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }

        scanner.close();
    }
}
