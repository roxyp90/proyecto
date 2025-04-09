import java.util.Scanner;

public class Ejercicionueve {
    public static void main(String[] args) {
        
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];
        
        // Crear objeto Scanner para leer los datos
        Scanner scanner = new Scanner(System.in);

        // Leer temperaturas mínimas y máximas para cada día
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce las temperaturas para el día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // Mostrar la temperatura media de cada día
        System.out.println("\nTemperaturas medias de cada día:");
        for (int i = 0; i < 5; i++) {
            double tempMedia = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.2f°C\n", i + 1, tempMedia);
        }

        // Encontrar el día con la menor temperatura máxima
        double minTempMax = tempMax[0];
        for (int i = 1; i < 5; i++) {
            if (tempMax[i] < minTempMax) {
                minTempMax = tempMax[i];
            }
        }

        // Mostrar los días con la menor temperatura máxima
        System.out.println("\nDías con la menor temperatura máxima:");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == minTempMax) {
                System.out.println("Día " + (i + 1) + ": " + minTempMax + "°C");
            }
        }

        // Leer la temperatura máxima que el usuario quiere buscar
        System.out.print("\nIntroduce una temperatura máxima para buscar los días (°C): ");
        double tempBuscar = scanner.nextDouble();

        // Buscar días con la temperatura máxima introducida
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == tempBuscar) {
                System.out.println("Día " + (i + 1) + " tiene una temperatura máxima de " + tempBuscar + "°C");
                encontrado = true;
            }
        }

        // Si no se encuentra ningún día con esa temperatura máxima
        if (!encontrado) {
            System.out.println("No hay ningún día con la temperatura máxima " + tempBuscar + "°C.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
