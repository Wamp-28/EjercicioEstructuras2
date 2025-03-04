import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Random Alt = new Random();
        int n1=0;
        int si_no = 0;
        int max = 3;
        int min = 1;
        int result;
        do {
            System.out.println("""
                    ---¡APUESTA Y GANA!---
            
            Digita cuanto dinero quieres apostar:
            
            """);
            n1 = Teclado.nextInt();
            if(n1<=0){
                System.out.println("No puedes apostar ese valor, ingresa otro valor");
            }
        }while(n1<=0);

        do {
            result = Alt.nextInt((max - min + 1)) + min;
            if (result == 1) {
                n1 = n1 * 2;
                System.out.println(" Su resultado es 1¡Ganaste! duplicaste tu dinero ahora tienes: " + n1);
            } else if (result == 2) {
                n1 = n1 / 2;
                System.out.println("Su resultado es 2 Perdiste :( , perdiste la mitad de tu dinero  ahora tienes: " + n1);
            } else {
                n1 = 0;
                System.out.println("Su resultado es 3 QUE MALA SUERTE PERDISTE TODO TU DINERO");
            }

            if (n1 > 0) {
                do {
                    System.out.println("""
                                
                                     ¿Quieres seguir jugando?
                                     -SI, presiona 1
                                     -NO, presiona 2
                                
                                """);
                    si_no = Teclado.nextInt();
                    if (si_no < 1 || si_no > 2) {
                        System.out.println("opcion equivocada ingrese una opcion correcta");
                    }
                }while(si_no < 1 || si_no > 2);
                if (si_no == 1) {
                    System.out.println("Continuamos...");
                } else if (si_no == 2) {
                    System.out.println("Terminaste el juego, te retitas con: " + n1 + "...");
                }

            } else {
                System.out.println("No puedes seguir jugando");
            }
        } while (n1 > 0 && si_no == 1);



    }
}