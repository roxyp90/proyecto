import java.util.Scanner;

public class SumarMatriz {
    public static void main(String[] args)
        int[][] matriz = new int[5][5];
        
    
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        
        int[] sumaFilas = new int[5];  
        int[] sumaColumnas = new int[5];  
        
    
        for (int i = 0; i < 5; i++) {
            sumaFilas[i] = 0;
            sumaColumnas[i] = 0;
        }
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];  
                sumaColumnas[j] += matriz[i][j];  
            }
        }

        
        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    
        System.out.println("\nSuma de las filas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        
        System.out.println("\nSuma de las columnas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Suma de la columna " + (i + 1) + ": " + sumaColumnas[i]);
        }

        
        scanner.close();
    }
}
