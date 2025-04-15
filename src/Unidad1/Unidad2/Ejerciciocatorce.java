import java.util.Scanner;

public class VentasEmpresa {
    public static void main(String[] args) {
        final int ARTICULOS = 5;
        final int SUCURSALES = 4;

        double[] precios = new double[ARTICULOS];
        int[][] cantidades = new int[ARTICULOS][SUCURSALES];
        double[] recaudacionSucursal = new double[SUCURSALES];
        double recaudacionTotal = 0;

        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Ingrese el precio de cada artículo:");
        for (int i = 0; i < ARTICULOS; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        
        System.out.println("\nIngrese las cantidades vendidas:");
        for (int i = 0; i < ARTICULOS; i++) {
            for (int j = 0; j < SUCURSALES; j++) {
                System.out.print("Cantidad del artículo " + (i + 1) + " en sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nCantidad total vendida por artículo:");
        for (int i = 0; i < ARTICULOS; i++) {
            int totalArticulo = 0;
            for (int j = 0; j < SUCURSALES; j++) {
                totalArticulo += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulo);
        }

        int totalSucursal2 = 0;
        for (int i = 0; i < ARTICULOS; i++) {
            totalSucursal2 += cantidades[i][1]; 
        }
        System.out.println("\nCantidad total de artículos en sucursal 2: " + totalSucursal2);

        
        int articulo3Sucursal1 = cantidades[2][0]; 
        System.out.println("Cantidad del artículo 3 en sucursal 1: " + articulo3Sucursal1);

        
        System.out.println("\nRecaudación total por sucursal:");
        for (int j = 0; j < SUCURSALES; j++) {
            double total = 0;
            for (int i = 0; i < ARTICULOS; i++) {
                total += cantidades[i][j] * precios[i];
            }
            recaudacionSucursal[j] = total;
            recaudacionTotal += total;
            System.out.printf("Sucursal %d: $%.2f%n", (j + 1), total);
        }

   
        System.out.printf("\nRecaudación total de la empresa: $%.2f%n", recaudacionTotal);

       
        int mayorSucursal = 0;
        for (int j = 1; j < SUCURSALES; j++) {
            if (recaudacionSucursal[j] > recaudacionSucursal[mayorSucursal]) {
                mayorSucursal = j;
            }
        }
        System.out.println("Sucursal con mayor recaudación: Sucursal " + (mayorSucursal + 1));

        scanner.close();
    }
}
