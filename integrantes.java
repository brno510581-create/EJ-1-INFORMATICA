import java.util.*;

public class integrantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> integrantes = new ArrayList<>();

        System.out.println("ingrese un integrante: ");
        String nombre = sc.nextLine();

        integrantes.add(nombre);
        System.out.println(nombre + " fue agregado.");

        while (true) {
            System.out.println("quieres agregar un integrante? ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("ingrese un integrante: ");
                nombre = sc.nextLine();
                integrantes.add(nombre);
                System.out.println(nombre + " fue agregado.");
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("no se agrego ningun integrante" + "  ");
                break;

            } else
                System.out.println("respuesta no valida");

            System.out.println("lista de integrantes:");
            for (String integrante : integrantes) {
                System.out.println(integrante);
            }

            sc.close();

        }
    }
}