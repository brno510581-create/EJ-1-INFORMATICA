import java.util.*;

public class ListaNombres {
    public static void main(String[] args) {

        
        ArrayList<String> lista_nombres = new ArrayList<String>();

       
        lista_nombres.add("Bruno");
        lista_nombres.add("Lucía");
        lista_nombres.add("Mateo");
        lista_nombres.add("Sofía");
        lista_nombres.add("Valentina");

        
        System.out.println("Lista de nombres:");
        for (String nombre : lista_nombres) {
            System.out.println(nombre);
        }
    }
}

            