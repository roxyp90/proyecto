import java.util.Scanner;

public class Ejercicioquince {
    public static void main(String[] args) {
        final int PARTIDOS = 15;

        String[][] equipos = new String[PARTIDOS][2];      
        int[][] resultados = new int[PARTIDOS][2];        

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Resultados de Quiniela ===");

        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("\nPartido " + (i + 1) + ":");

            System.out.print("  Nombre del equipo local: ");
            equipos[i][0] = scanner.nextLine();

            System.out.print("  Nombre del equipo visitante: ");
            equipos[i][1] = scanner.nextLine();

            System.out.print("  Goles del equipo local (" + equipos[i][0] + "): ");
            resultados[i][0] = scanner.nextInt();

            System.out.print("  Goles del equipo visitante (" + equipos[i][1] + "): ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine(); 
        }

        
        System.out.println("\n=== Resultados Finales ===");
        for (int i = 0; i < PARTIDOS; i++) {
            String equipoLocal = equipos[i][0];
            String equipoVisitante = equipos[i][1];
            int golesLocal = resultados[i][0];
            int golesVisitante = resultados[i][1];

            System.out.println("Partido " + (i + 1) + ": " + equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);

            if (golesLocal > golesVisitante) {
                System.out.println("  → Ganó " + equipoLocal);
            } else if (golesLocal < golesVisitante) {
                System.out.println("  → Ganó " + equipoVisitante);
            } else {
                System.out.println("  → Empate");
            }
        }

        scanner.close();
    }
}
