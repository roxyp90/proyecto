package Unidad2
import java.util.Scanner;

public class Practicauno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
       
        if (num1 > num2) {
            int suma = num1 + num2;
            int diferencia = num1 - num2;
            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
        } else {
            
            if (num2 != 0) { 
                double producto = num1 * num2;
                double division = (double) num1 / num2;
                System.out.println("El producto es: " + producto);
                System.out.println("La división es: " + division);
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }
        
        
        scanner.close();
    }
}



