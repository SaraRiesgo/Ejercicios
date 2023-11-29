import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo");
        String nombre = teclado.nextLine();
        System.out.println("Introduce tu calle");
        String calle = teclado.nextLine();
        System.out.println("Introduce tu código postal");
        String codigoPostal = teclado.nextLine();
        System.out.println("Introduce tu localidad");
        String localidad = teclado.nextLine();
        System.out.println("Introduce tu provincia");
        String provincia = teclado.nextLine();
        System.out.println("Introduce tu país");
        String pais = teclado.nextLine();
        System.out.println(nombre);
        System.out.println(calle);
        System.out.println(codigoPostal);
        System.out.println(localidad);
        System.out.println(provincia);
        System.out.println(pais);

    }
}
