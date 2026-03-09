import java.util.*;

public class Filtrarcalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> calificaciones = new ArrayList<>();

        calificaciones.add(2);
        calificaciones.add(10);
        calificaciones.add(5);
        calificaciones.add(9);
        calificaciones.add(6);
        calificaciones.add(3);
        calificaciones.add(8);
        calificaciones.add(7);
        calificaciones.add(1);
        calificaciones.add(4);

for (int calificacion : calificaciones) {
            System.out.println("la calificacion es: " + calificacion);
            System.out.println(" ");
        }


        ArrayList<Integer> aprobados = new ArrayList<>();
        ArrayList<Integer> desaprobados = new ArrayList<>();

        for (int calificacion : calificaciones) {
            if (calificacion >= 5) {
                aprobados.add(calificacion);
            } else if (calificacion < 5) {
                desaprobados.add(calificacion);

            }
        }

       
        System.out.println(" ");
        System.out.println("Los aprobados son: " + aprobados);
        System.out.println(" ");
        System.out.println("Los desaprobados son: " + desaprobados);
        System.out.println(" ");

        double promaprobados = 0, promreprobados = 0;

        for (int nota : aprobados) {
            promaprobados += nota;
        }
        if (aprobados.size() > 0) {
            promaprobados /= aprobados.size();
        }

        for (int nota : desaprobados) {
            promreprobados += nota;
        }
        if (desaprobados.size() > 0) {
            promreprobados /= desaprobados.size();
        }

        System.out.println("Promedio de aprobados: " + promaprobados);
        System.out.println(" ");
        System.out.println("Promedio de reprobados: " + promreprobados);
        System.out.println(" ");

        System.out.println("quieres modificar una calificacion? ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("en que pocicion esta? (numero)");
            int pos = sc.nextInt();
            System.out.print("Ingrese la nueva nota: ");
            int nuevaNota = sc.nextInt();
            calificaciones.set(pos - 1, nuevaNota);

           for (int calificacion : calificaciones) {
            System.out.println("las nuevas  calificaciones son: " + calificacion);
            System.out.println(" ");
        }


            sc.close();
        }
    }
}