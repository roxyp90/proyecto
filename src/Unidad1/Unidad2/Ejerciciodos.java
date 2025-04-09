import java.util.Scanner;

public class Ejerciciodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] vectorOriginal = new String[5];
        
        
        System.out.println("Introduce 5 cadenas de caracteres:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }
        
        
        String[] vectorInvertido = new String[5];
        

        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }
        
        
        System.out.println("Vector invertido:");
        for (String elemento : vectorInvertido) {
            System.out.println(elemento);
        }
        
        
        scanner.close();
    }
}