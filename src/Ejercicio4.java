import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // 1 hora = 60 segundos
        // 1 minuto = 60 segundos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        int segundosteclado = teclado.nextInt();
        System.out.println("Tus segundos son " +segundosteclado);
        int horas = segundosteclado / 3600;
        System.out.println("Horas: " +horas);
        int restohoras = segundosteclado % 3600;
        int minutos = restohoras / 60;
        System.out.println("minutos: " +minutos);
        int segundos = restohoras % 60;
        System.out.println("segundos: " +segundos);

    }
}
