import java.util.Arrays;
import java.util.Random;

public class Ejerciciocinco {
    public static void main(String[] args) {
        int tamano = 10;
        
    
        int[] vector = new int[tamano];
        

        Random random = new Random();
        
        
        for (int i = 0; i < tamano; i++) {
            vector[i] = random.nextInt(101); 
        }
        
        
        System.out.println("Vector original:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        
        
        Arrays.sort(vector);
        
        
        System.out.println("\nVector ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
