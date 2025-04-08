import java.util.Scanner;

public class Quizdos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();

        boolean esPerfecto = false;

        if (num > 1) { 
            int sumDivisores = 1;
            System.out.println(Math.sqrt(num));
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) { 
                    sumDivisores +=i;
        
                    if (i !=num/i) {
                     sumDivisores +=num/i;
                    }
                    
             }
             esPerfecto = (sumDivisores == num);
             
             }
         }
         System.out.println(" El numero " + num + (esPerfecto ? " es perfecto " : " no es perfecto"));
         input.close();
    }
}