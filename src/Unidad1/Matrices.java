public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

 
        int elemento = matriz[0][1];
        System.out.println("El elemento en la fila 0, columna 1 es: " + elemento); 

        
        System.out.println("\nElementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        int[][] otraMatriz = new int[3][2]; 

        otraMatriz[0][0] = 10;
        otraMatriz[1][1] = 20;
        otraMatriz[2][0] = 30;

        System.out.println("\nElementos de la otra matriz:");
        for (int i = 0; i < otraMatriz.length; i++) {
            for (int j = 0; j < otraMatriz[i].length; j++) {
                System.out.print(otraMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}