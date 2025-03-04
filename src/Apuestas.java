import java.util.Random;
import java.util.Scanner;

public class Apuestas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int monto = 2000;
        String continuar = "";

        do {
            System.out.println("Tu saldo actual es: " + monto);
            System.out.print("Ingresa tu apuesta: ");
            int apuesta = scanner.nextInt();

            if (apuesta > monto || apuesta <= 0) {
                System.out.println("Apuesta inválida. Debes apostar un monto válido.");
                continue;
            }

            int resultado = random.nextInt(3) + 1; // Genera 1, 2 o 3
            switch (resultado) {
                case 1:
                    monto += apuesta;
                    System.out.println("FELICIDADES, Tu monto se ha multiplicado.");
                    break;
                case 2:
                    monto -= apuesta / 2;
                    System.out.println("Perdiste la mitad de tu apuesta. ¡Sigue intentando!");
                    break;
                case 3:
                    monto -= apuesta;
                    System.out.println("¡Oh no! Perdiste toda tu apuesta.");
                    break;
            }

            if (monto <= 0) {
                System.out.println("Te has quedado sin dinero. Fin del juego.");
                break;
            }

            System.out.print("¿Deseas continuar jugando? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Gracias por jugar. Tu saldo final es: " + monto);
    }
}








