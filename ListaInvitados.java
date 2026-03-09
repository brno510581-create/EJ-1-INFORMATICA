import java.util.*;

public class ListaInvitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> invitados = new ArrayList<String>();
        invitados.add("bruno");
        invitados.add("lucia");
        invitados.add("mateo");
        invitados.add("sofia");
        invitados.add("valentina");
        invitados.add("juan");
        invitados.add("camila");
        invitados.add("martin");

        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine();

        if (invitados.contains(nombre)) {
            System.out.println(nombre + " ya está en la lista.");
        } else {
            System.out.println(nombre + " no fue invitado.");
            System.out.print("¿Querés agregarlo? ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                invitados.add(nombre);
                System.out.println(nombre + " fue agregado.");
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("No se agregó el nombre.");
            }
        }

        System.out.println("Lista de invitados:");
        System.out.println(invitados);
        System.out.print("Querés eliminar a alguien de la lista? ");
        String eliminar = sc.nextLine();

        if (eliminar.equalsIgnoreCase("si")) {
            System.out.print("a quien quieres eliminar? ");
            System.out.println(" ");
            System.out.println(invitados);
            String nombreEliminar = sc.nextLine();

            if (invitados.remove(nombreEliminar)) {
                System.out.println(nombreEliminar + " fue eliminado.");
            } else {
                System.out.println("Ese nombre no está en la lista.");
            }
        }

        System.out.println(" Bien esta es la lista final de invitados:");
        for (String inv : invitados) {
            System.out.println("- " + inv);
        }

        sc.close();
    }
}
