import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int iniciarNuevoJuego;

        do {
            System.out.print("Ingrese el monto inicial: ");
            double monto = teclado.nextDouble();
            boolean seguirJugando = true;

            while (monto > 0 && seguirJugando) {
                int d1 = aleatorio.nextInt(3) + 1;
                System.out.println("\nResultado de la apuesta: " + d1);

                switch (d1) {
                    case 1:
                        monto *= 2;
                        System.out.println("¡Felicidades! Su monto se ha duplicado. Nuevo saldo: " + monto);
                        break;
                    case 2:
                        monto /= 2;
                        System.out.println("Has perdido la mitad del dinero. Nuevo saldo: " + monto);
                        break;
                    case 3:
                        monto = 0;
                        System.out.println("Que mala suerte, has perdido todo tu dinero.");
                        break;
                }

                if (monto == 0) {
                    System.out.println("El juego ha terminado. Se quedó sin saldo.");
                    break;
                }

                System.out.print("¿Desea continuar jugando? 1 = Sí, 2 = No: ");
                int opcion = teclado.nextInt();

                if (opcion == 2) {
                    System.out.println("Gracias por jugar. Su saldo final es: " + monto);
                    seguirJugando = false;
                }
            }

            System.out.print("\n¿Desea iniciar un nuevo juego? 1 = Sí, 2 = No: ");
            iniciarNuevoJuego = teclado.nextInt();

        } while (iniciarNuevoJuego == 1);

        System.out.println("Gracias por ti visita. ¡Vuelve pronto!");
        teclado.close();
    }
}

