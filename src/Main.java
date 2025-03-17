import java.util.Random;
import java.util.Scanner;

// Codigo Jair Blanco

public class Main {
    public static void main(String[] args) {
        int vida = 15;
        int experiencia = 0;
        int resultado;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego, tienes " + vida + " de vida y " + experiencia + " puntos de experiencia." );

        while (vida > 0 && experiencia < 50) {
            scanner.nextLine();

            resultado = random.nextInt(12) + 1;
            System.out.println("Resultado: " + resultado);
            if (resultado == 1 || resultado == 2) {
                vida = vida + 1;
                System.out.println("Ganaste 1 punto de vida");
            } else if (resultado == 3 || resultado == 4 || resultado == 5) {
                vida = vida - 5;
                System.out.println("Perdiste 5 puntos de vida");
            } else if (resultado == 6 || resultado == 7) {
                experiencia = experiencia + 3;
                System.out.println("Ganaste 3 puntos de experiencia");
            } else if (resultado == 8 || resultado == 9) {
                experiencia = experiencia - 6;
                System.out.println("Perdiste 6 puntos de experiencia");
            } else if (resultado == 10 || resultado == 11) {
                vida = vida - 8;
                System.out.println("Perdiste 8 puntos de vida");
            } else if (resultado == 12) {
                resultado = random.nextInt(3)+1;
                System.out.println("Evento especial: " + resultado);
                if (resultado == 1) {
                    experiencia = experiencia + 10;
                    System.out.println("Ganaste 10 puntos de experiencia");
                } else if (resultado == 2) {
                    vida = vida - 2;
                    System.out.println("perderas 2 puntos de vida por turno");
                } else if (resultado == 3) {
                    vida = vida / 2;
                    System.out.println("perdiste la mitad de tu vida ");
                }
            } System.out.println("tienes " + vida + " puntos de vida y " + experiencia +" puntos de experiencia");
            if (vida <= 0) {
                System.out.println("Moriste, fin del juego");
            } else if (experiencia >= 50) {
                System.out.println("Felicidades, ganaste el juego");
            }
        }
    }
}