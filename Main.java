import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        Random Alt = new Random();
        int num=0;
        int si_no = 0;
        int max = 3;
        int min = 1;
        int mon;
        do {
            System.out.println("""
                     *CASINO*
            
            Digita cuanto dinero desea apostar:
            
            """);
            num = Teclado.nextInt();
            if(num<=0){
                System.out.println("El valor ingresado es invalido, ingresa otro valor");
            }
        }while(num<=0);

        do {
            mon = Alt.nextInt((max - min + 1)) + min;
            if (mon == 1) {
                num = num * 2;
                System.out.println(" Su resultado es 1 !Acabas de duplicar tu dinero! ahora tienes: " + num);
            } else if (mon == 2) {
                num = num / 2;
                System.out.println("Su resultado es 2 !Acabas de perder la mitad de tu dinero! ahora tienes: " + num);
            } else {
                num = 0;
                System.out.println("Su resultado es 3 !QUE MALA SUERTE ACABAS DE PERDER TODO TU DINERO");
            }

            if (num > 0) {
                do {
                    System.out.println("""
                                
                                     ¿Quieres seguir jugando?
                                     
                                     -SI, presiona 1
                                     -NO, presiona 2
                                
                                """);
                    si_no = Teclado.nextInt();
                    if (si_no < 1 || si_no > 2) {
                        System.out.println("Opcion incorrecta ingrese porfavor una opción valida");
                    }
                }while(si_no < 1 || si_no > 2);
                if (si_no == 1) {
                    System.out.println("Continuemos apostando...");
                } else if (si_no == 2) {
                    System.out.println("Fin del juego, te retiras con un monto de: " + num + "...");
                }

            } else {
                System.out.println("No puedes seguir jugando");
            }
        } while (num > 0 && si_no == 1);



    }







}
