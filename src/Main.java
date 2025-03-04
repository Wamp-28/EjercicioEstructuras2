import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random jose = new Random();
        int max = 3;
        int min = 1;
        int d1;
        int num, eleccion;

        System.out.print("Por favor, ingrese un monto inicial: ");
        num = teclado.nextInt();

        while (num > 0) {
            System.out.print("Elige un número (1, 2 o 3): ");
            eleccion = teclado.nextInt();


            d1 = jose.nextInt((max - min + 1)) + min;
            System.out.println("El número aleatorio es: " + d1);

            if (eleccion == d1) {
                System.out.println("El monto se ha duplicado.");
                num *= 2;
            } else {
                switch (d1) {
                    case 1 -> {
                        System.out.println("Has perdido la mitad del monto.");
                        num /= 2;
                    }
                    case 2 -> {
                        System.out.println("Has perdido la mitad del monto.");
                        num /= 2;
                    }
                    case 3 -> {
                        System.out.println("El monto se ha perdido.");
                        num = 0;
                    }
                }
            }

            System.out.println("El monto actual es: " + num);
        }

        System.out.println("El juego ha terminado. Gracias por jugar.");
    }
}
