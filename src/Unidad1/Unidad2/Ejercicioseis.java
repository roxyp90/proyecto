import java.util.Scanner;

public class Ejercicioseis {
    public static void main(String[] args) {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

    
        int[] dias = {
            31, 28, 31, 30, 31, 30, 
            31, 31, 30, 31, 30, 31
        };

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        
        if (numeroMes >= 1 && numeroMes <= 12) {
            int indice = numeroMes - 1;
            
            System.out.println("Mes: " + meses[indice]);
            System.out.println("Días: " + dias[indice]);
        } else {
            System.out.println("Número de mes inválido. Debes ingresar un número entre 1 y 12.");
        }

        scanner.close();
    }
}
