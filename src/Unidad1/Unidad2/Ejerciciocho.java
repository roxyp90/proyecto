import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejerciciocho {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Introduce el nombre del alumno (introduce '*' para terminar): ");
            String nombre = scanner.nextLine();

            
            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            
            nombres.add(nombre);
            edades.add(edad);
        }

    
        System.out.println("\nAlumnos mayores de edad (18 o más años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

    
        int maxEdad = Integer.MIN_VALUE;
        for (int edad : edades) {
            if (edad > maxEdad) {
                maxEdad = edad;
            }
        }

        
        System.out.println("\nAlumnos con la mayor edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        scanner.close();
    }
}
