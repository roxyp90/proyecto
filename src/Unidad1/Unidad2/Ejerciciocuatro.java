import java.util.Scanner;

public class Ejerciciocuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] vector = new int[10];
        int contador = 0;
        
        
        while (contador < 10) {
            System.out.print("Introduce un número (negativo para detener): ");
            int numero = scanner.nextInt();
            
            
            if (numero < 0) {
                break;
            }
            
            
            vector[contador] = numero;
            contador++;
        }
        
    
        System.out.println("\nElementos introducidos en el vector:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }
        
        scanner.close();
    }
}
