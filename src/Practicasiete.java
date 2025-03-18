import java.util.Scanner;

public class Practicasiete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número entero positivo de hasta tres cifras: ");
        numero = scanner.nextInt();

    
        if (numero < 0) {
            System.out.println("Error: El número debe ser positivo.");
    
            
        }
        


      int cifras = String.valueOf(numero).length();

        
        if (cifras == 1) {
            System.out.println("El número tiene 1 cifra.");
        } else if (cifras == 2) {
            System.out.println("El número tiene 2 cifras.");
        } else if (cifras == 3) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("Error: El número tiene más de 3 cifras.");
        }

        scanner.close();
    }
}