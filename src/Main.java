import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int vida = 15;
        int experiencia = 0;
        boolean veneno = false;

        while (vida > 0 && experiencia < 50) {
            System.out.println("Presiona Enter para lanzar el dado");
            teclado.nextLine();
            int dado = ale.nextInt(12) + 1;
            System.out.println("Has lanzado un " + dado);

            if (dado == 1 || dado == 2) {
                vida += 1;
                System.out.println("Encuentras una fuente de vida. Ganas 1 punto de vida.");
            } else if (dado >= 3 && dado <= 5) {
                vida -= 5;
                System.out.println("Eres atacado brutalmente. Pierdes 5 puntos de vida.");
            } else if (dado == 6 || dado == 7) {
                experiencia += 3;
                System.out.println("Ganas experiencia en la aventura. 3 puntos de experiencia.");
            } else if (dado == 8 || dado == 9) {
                experiencia = Math.max(0, experiencia - 6);
                System.out.println("Cometes un error grave. Pierdes 6 puntos de experiencia.");
            } else if (dado == 10 || dado == 11) {
                vida -= 8;
                System.out.println("Caes en una trampa letal. Pierdes 8 puntos de vida.");
            } else if (dado == 12) {
                int eventoEspecial = ale.nextInt(3) + 1;
                if (eventoEspecial == 1) {
                    experiencia += 10;
                    System.out.println("Encuentras un pergamino antiguo. Ganas 10 puntos de experiencia.");
                } else if (eventoEspecial == 2) {
                    veneno = true;
                    System.out.println("Envenenado, pierdes 2 puntos de vida por turno.");
                } else if (eventoEspecial == 3) {
                    vida /= 2;
                    System.out.println("Un demonio te ataca, tu vida se reduce a la mitad.");
                }
            }

            if (veneno) {
                vida -= 2;
                System.out.println("Pierdes 2 puntos de vida.");
            }

            System.out.println("Vida: " + vida + ", Experiencia: " + experiencia + "\n");

            if (experiencia >= 50) {
                System.out.println("Ganaste.");
                break;
            }
            if (vida <= 0) {
                System.out.println("Llegaste a 0, perdiste.");
                break;
            }
        }
        teclado.close();
    }

}