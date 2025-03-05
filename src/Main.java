import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 3;
        int min = 1;
        int d1;
        boolean seguirJugando;
        double dineroInicial;

        System.out.println("DIGITE EL DINERO INICIAL");
        dineroInicial = teclado.nextInt();

        d1 = ale.nextInt((max - min + 1)) + min ;
        seguirJugando = true;

        while (dineroInicial > 0 && seguirJugando) {
            switch (d1) {
                case 1:
                    dineroInicial *= 2;
                    System.out.println("SE DUPLICO TU DINERO, TU NUEVO SALDO ES: " + dineroInicial);
                    break;
                case 2:
                    dineroInicial /= 2;
                    System.out.println("PERDISTE LA MITAD, AHORA TU SALDO ES: " + dineroInicial);
                    break;
                case 3:
                    dineroInicial = 0;
                    System.out.println("PERDISTE TODO");
                    break;
            }

            if (dineroInicial > 0) {
                System.out.println("¿DESEAS CONTINUAR JUGANDO? 1=Sí 2=No");
                int eleccion = teclado.nextInt();
                seguirJugando = (eleccion == 1);
                if (seguirJugando) {
                    System.out.println("JUEGA NUEVAMENTE");
                    d1 = ale.nextInt((max - min + 1)) + min ;
                } else {
                    System.out.println("TE RETIRAS CON " + dineroInicial);
                }
            }
        }
    }
}