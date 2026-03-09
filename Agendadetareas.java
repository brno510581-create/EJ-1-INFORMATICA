import java.util.*;

public class Agendadetareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tareas = new ArrayList<String>();

        tareas.add("barrer");
        tareas.add("lavar la ropa");
        tareas.add("pasear al perro");
        tareas.add("tender la cama");
        tareas.add("cocinar");

        int numeros = 1;
        for (String tarea : tareas) {
            System.out.println(numeros + "  " + tarea);
            numeros++;
        }

        while (true) {

            System.out.println("quieres agregar una tarea? ");
            
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("que tarea quieres agregar?");
                String nombre = sc.nextLine();
                tareas.add(nombre);
                System.out.println("la tarea fue agregada");
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("no se agrego ninguna tarea" + "  ");
                break;
            } else {
                System.out.println("respuesta no valida");
            }
        }
        while (!tareas.isEmpty()) {
            System.out.println("Tareas pendientes: " + tareas);
            System.out.println("Has hecho alguna tarea?");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("que tarea hiciste?");
                String tarea = sc.nextLine();
                tareas.remove(tarea);
                System.out.println("la tarea fue eliminada");
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("no hiciste ninguna tarea" + "  ");
            } else {
                System.out.println("respuesta no valida");
            }

        }
        System.out.println("completaste todas las tareas ");
        sc.close();
    }

}
