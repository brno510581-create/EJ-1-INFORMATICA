import java.util.*;

public class buscarunnumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numero = new ArrayList<>();

        numero.add(7);
        numero.add(5);
        numero.add(99);
        numero.add(3);
        numero.add(11);
        numero.add(76);
        numero.add(36);



System.out.println("que nuemro quieres buscar?");
int numerobuscar = sc.nextInt();

if (numero.contains(numerobuscar)) {
    System.out.println("el numero esta en la pocion " + numero.indexOf(numerobuscar));



} else {
    System.out.println("el numero no esta en la lista");
}

sc.close();
        
    }
}