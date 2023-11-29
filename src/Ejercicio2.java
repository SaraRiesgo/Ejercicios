import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número 1");
        int numero1= teclado.nextInt();
        System.out.println("Introduce número 2");
        int numero2= teclado.nextInt();
        System.out.println("Introduce número 3");
        int numero3= teclado.nextInt();
        System.out.println("Introduce número 4");
        int numero4= teclado.nextInt();
        System.out.println("introduce número 5");
        int numero5= teclado.nextInt();
        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        int aux = numero1;
        numero1=numero2;
        numero2=numero3;
        numero3=numero4;
        numero4=numero5;
        numero5=aux;
        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        aux=numero5;
        numero5=numero4;
        numero4=numero3;
        numero3=numero2;
        numero2=numero1;
        numero1=aux;
        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);



    }
}
