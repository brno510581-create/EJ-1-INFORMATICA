


public class persona {

    // Atributos
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;

    // Constructor sirve para darle valores iniciales a los atributos
    public persona(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("  ");
    }

    // Método principal
    public static void main(String[] args) {

        // Crear 3 objetos Persona con datos diferentes
        persona p1 = new persona("Bruno", "González", 17, "Uruguayo");
        persona p2 = new persona("Lucía", "Martínez", 18, "Argentina");
        persona p3 = new persona("Mateo", "Pérez", 19, "Chileno");

        // Mostrar los datos usando el método mostrarDatos()
        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
    }
}
