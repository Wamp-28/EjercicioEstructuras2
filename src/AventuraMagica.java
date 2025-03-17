import java.util.Random;
import java.util.Scanner;

public class AventuraMagica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean jugarDeNuevo;

        do {
            int vida = 15;
            int experiencia = 0;
            boolean envenenado = false;
            jugarDeNuevo = false;

            System.out.println("¡Bienvenido a la aventura mágica, una experiencia nueva!");
            System.out.println("Debes alcanzar 50 puntos de experiencia antes de que tu vida llegue a 0.");
            System.out.println("Estado inicial: Vida = " + vida + ", Experiencia = " + experiencia);

            while (vida > 0 && experiencia < 50) {
                System.out.println("Presiona ENTER para tirar el dado...");
                scanner.nextLine();
                int dado = random.nextInt(12) + 1;
                System.out.println("Obtuviste un " + dado);

                if (dado >= 1 && dado <= 2) {
                    vida += 1;
                    System.out.println("Encontraste una fuente de vida. +1 sumaste punto de vida (Vida: " + vida + ")");
                } else if (dado >= 3 && dado <= 5) {
                    vida -= 5;
                    System.out.println("Fuiste atacado brutalmente. -5 disminuiste puntos de vida (Vida: " + vida + ")");
                } else if (dado >= 6 && dado <= 7) {
                    experiencia += 3;
                    System.out.println("Ganaste experiencia en la aventura. +3 sumaste puntos de experiencia (Experiencia: " + experiencia + ")");
                } else if (dado >= 8 && dado <= 9) {
                    experiencia -= 6;
                    System.out.println("Cometiste un error grave. -6 disminuiste puntos de experiencia (Experiencia: " + experiencia + ")");
                } else if (dado >= 10 && dado <= 11) {
                    vida -= 8;
                    System.out.println("Caíste en una trampa letal. -8 disminuiste puntos de vida (Vida: " + vida + ")");
                } else if (dado == 12) {
                    int eventoEspecial = random.nextInt(3);
                    if (eventoEspecial == 0) {
                        experiencia += 10;
                        System.out.println("¡Encontraste un pergamino antiguo! +10 sumaste puntos de experiencia (Experiencia: " + experiencia + ")");
                    } else if (eventoEspecial == 1) {
                        envenenado = true;
                        System.out.println("¡Te infectaste con veneno! Perderás -2 disminuiste puntos de vida por turno.");
                    } else {
                        vida /= 2;
                        System.out.println("Eres atacado por un demonio. Tu vida se reduce a la mitad (Vida: " + vida + ")");
                    }
                }

                if (envenenado) {
                    vida -= 2;
                    System.out.println("El veneno te hace perder -2 disminuiste puntos de vida (Vida: " + vida + ")");
                }
            }

            if (vida <= 0) {
                System.out.println("¡Has muerto! Fin del juego.");
            } else {
                System.out.println("¡Felicidades! Has alcanzado 50 puntos de experiencia y escapaste de la dimensión mágica.");
            }

            System.out.println("¿Quieres jugar de nuevo? (Si/No)");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("si")) {
                jugarDeNuevo = true;
            }

        } while (jugarDeNuevo);

        System.out.println("Gracias por jugar, espero hubieras podido disfrutar tu nueva experiencia. ¡Hasta la próxima aventura!");
        scanner.close();
    }
}



