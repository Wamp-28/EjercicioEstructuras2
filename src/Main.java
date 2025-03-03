import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random alet = new Random();
        int max = 3;
        int min = 1;
        System.out.println("Ingresa el monto inicial");
        int monto = teclado.nextInt();
        int r = alet.nextInt((max - min + 1)) + min;
        System.out.println("++" + r + "++");

        do {
            if (r == 1) {
                monto *= 2;
                System.out.println(monto);
                System.out.println("¿Deseas volver a jugar?\nsi=1 o no=2");
                int confirmacion = teclado.nextInt();
                if (confirmacion == 1) {
                    r = alet.nextInt((max - min + 1)) + min;
                    System.out.println(r);
                } else {
                    if (confirmacion == 2) {
                        System.out.println("Retira:" + monto);
                        break;
                    }

                    if (confirmacion < 1 || confirmacion > 2) {
                        System.out.println("Opcion no valida");
                    }
                }
            } else if (r == 2) {
                monto /= 2;
                System.out.println(monto);
                System.out.println("Tu monto se dividio a la mitad");
                System.out.println("¿Deseas volver a jugar?\nsi=1 o no=2");
                int confirmacion = teclado.nextInt();
                if (confirmacion == 1) {
                    r = alet.nextInt((max - min + 1)) + min;
                    System.out.println("++" + r + "++");
                } else {
                    if (confirmacion == 2) {
                        System.out.println("Retira:" + monto);
                        break;
                    }

                    if (confirmacion < 1 || confirmacion > 2) {
                        System.out.println("Opcion no valida");
                    }
                }
            } else if (r == 3) {
                monto *= 0;
                System.out.println(monto);
                System.out.println("Perdiste todo :(");
                break;
            }
        } while(monto > 0);

    }
}

