import java.util.*;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> temperaturas = new ArrayList<Integer>();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la temperatura del día " + i + ": ");
            int temp = sc.nextInt();
            temperaturas.add(temp);

        }

        for (int i = 0; i < temperaturas.size(); i++) {
            System.out.println("Día " + (i + 1) + " : " + temperaturas.get(i) + "°C");

        }

        int suma = 0;
        for (int temp : temperaturas) {
            suma += temp;
        }
        double promedio = (double) suma / temperaturas.size();
        System.out.println("Temperatura promedio: " + promedio + "°C");

        int max = temperaturas.get(0);
        int min = temperaturas.get(0);
        int diaMax = 1;
        int diaMin = 1;

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > max) {
                max = temperaturas.get(i);
                diaMax = i + 1;
            }
            if (temperaturas.get(i) < min) {
                min = temperaturas.get(i);
                diaMin = i + 1;
            }
        }

        System.out.println("Temperatura máxima: " + max + "°C (Dia " + diaMax + ")");
        System.out.println("Temperatura mínima: " + min + "°C (Dia " + diaMin + ")");

        System.out.println("quieres reemplazar la temperatura de un dia?");

        sc.nextLine();

        String respuesta = sc.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el número del día (1-7): ");
            int dia = sc.nextInt();
            System.out.print("Ingrese la nueva temperatura: ");
            int nuevaTemp = sc.nextInt();

            temperaturas.set(dia - 1, nuevaTemp);

            System.out.println("La temperatura del día " + dia + " es " + nuevaTemp + "°C");
            for (int i = 0; i < temperaturas.size(); i++) {
                System.out.println("Dia " + (i + 1) + " : " + temperaturas.get(i) + "°C");
            }

        }
        sc.close();
    }
}