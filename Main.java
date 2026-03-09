import java.util.*;

class Estudiante {

    
    private String nombre;
    private String apellido;
    private int edad;
    private String localidad;


    public Estudiante(String nombre, String apellido, int edad, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
    }


    public int calcularAnioNacimiento() {
        return 2025 - edad;
    }

   
    public int getEdad() {
        return edad;
    }

    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Localidad: " + localidad);
        System.out.println("Año de nacimiento: " + calcularAnioNacimiento());
        System.out.println("            ");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<Estudiante> lista = new ArrayList<>();

       

    
        for (int i = 1; i <= 6; i++) {
            System.out.println(" Estudiante " + i );      
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Localidad: ");
            String localidad = sc.nextLine();

         
            Estudiante e = new Estudiante(nombre, apellido, edad, localidad);

           
            lista.add(e);
        }

    
        System.out.println("Estudiantes mayores de 18 años");
       

    
        for (Estudiante e : lista) {
            if (e.getEdad() > 18) {
                e.mostrarDatos();
            }
        }

        sc.close();
    }
}
