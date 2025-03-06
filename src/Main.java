import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 3;
        int min = 1;
        int d1;
        int Cn;
        int Minicial;

        System.out.println("INGRESE UN MONTO INICIAL");
        Minicial = teclado.nextInt();

        d1 = ale.nextInt((max - min + 1)) + min ;

        do {
            if (d1==1){
                Minicial= Minicial * 2;
                System.out.println("¡SE DUPLICA! SU MONTO ES DE: " + Minicial);
                System.out.println("QUIERE SEGUIR JUGANDO 1 = si 2 = no");
                Cn = teclado.nextInt();
                if (Cn==1){
                    System.out.println("JUGANDO");
                    d1 = ale.nextInt((max - min + 1)) + min ;
                    continue;
                } else {
                    System.out.println("SE RETIRO CON " + Minicial);
                    break;
                }

            }else if (d1==2){
                Minicial= Minicial / 2;
                System.out.println("¡PIERDE LA MITAD! SU MONTO ES DE: " + Minicial);
                System.out.println("QUIERE SEGUIR JUGANDO 1=si 2=no");
                Cn = teclado.nextInt();
                if (Cn==1){
                    System.out.println("JUGANDO");
                    d1 = ale.nextInt((max - min + 1)) + min ;
                    continue;
                } else {
                    System.out.println("SE RETIRO CON " + Minicial);
                    break;
                }
            }else if (d1==3){
                Minicial = 0;
                System.out.println("PERDIO");

            }

        }while (Minicial>0);
    }
}
