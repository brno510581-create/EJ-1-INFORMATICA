import java.util.Scanner;

public class menorymayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temperaturas = new int[10]; 

        
        System.out.println("Ingrese las 10 temperaturas:");
        for (int a = 0; a < temperaturas.length; a++) {
            System.out.print("Temperatura " + (a + 1) + ": ");
            temperaturas[a] = sc.nextInt();
        }

       
        int mayor = temperaturas[0];
        int menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

       
        System.out.println("La temperatura mas alta es: " + mayor);
        System.out.println("La temperatura mas baja es: " + menor);

        sc.close();
    }
}
