import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce número 1");
        int numero1= teclado.nextInt();
        System.out.println("introduce número 2");
        int numero2= teclado.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
        System.out.println("El resto es: "+resto);

    }
}
