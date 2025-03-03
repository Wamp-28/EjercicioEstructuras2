import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int max = 3;
        int min = 1;
        int d1;
        int dinero;
        int conf;

        System.out.println("Ingrese el monto inicial");

        dinero = teclado.nextInt();


        while(dinero > 0){



        d1= ale.nextInt((max - min + 1)) + min;

        switch (d1){

            case 1 -> {
                dinero*=2;
                System.out.println("Tu resultado fue 1, !DUPLICASTE TU DINERO¡ Ahora tienes: " + dinero);

            }

            case 2 -> {
                dinero/=2;
                System.out.println("Tu resultado fue 2, !PERDISTE LA MITAD DE TU DINERO¡ Ahora tienes: " + dinero);

            }

            case 3 -> {
                dinero = 0;
                System.out.println("Tu resultado fue 3, !PERDISTE TU DINERO¡ Ahora tienes: " + dinero);

            }
        }

        if (dinero == 0){
            break;
        }

        System.out.println("¿Quieres seguir jugando? 1: Si, 2: No");
        conf = teclado.nextInt();
        if (conf==2){
            break;
        }

        }

        System.out.println("Juego terminado. Te quedaste con " + dinero);
    }
}