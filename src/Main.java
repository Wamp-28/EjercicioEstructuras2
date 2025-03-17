import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int evm = 1, evmx = 3, evalto;
        int ptsexp = 0, rta, alto, max = 12, min = 1, rta1;
        double ptsvd = 15;

        System.out.println("Bienvenido al mundo magico");
        System.out.println("¿Desea iniciar?");
        System.out.println("""
                1)si
                2)No""");
        rta1 = teclado.nextInt();
        if (rta1 == 1) {

            alto = ale.nextInt((max - min + 1)) + min;
            System.out.println("**" + alto + "**");

            do {
                if (alto == 1 || alto == 2) {
                    ptsvd = ptsvd + 1;
                    System.out.println("Encontraste una fuente de vida");
                    System.out.println("Obtiene un " + alto + "->Gana +1 punto de vida");
                    System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                    System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                } else if (alto == 3 || alto == 4 || alto == 5) {
                    ptsvd = ptsvd - 5;
                    System.out.println("Fuiste atracado fuertemente ");
                    System.out.println("Obtiene un " + alto + "->Pierde -5 puntos de vida ");
                    System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                    System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                } else if (alto == 6 || alto == 7) {
                    ptsexp = ptsexp + 3;
                    System.out.println("Ganaste experiencia en la aventura");
                    System.out.println("Obtiene un " + alto + "->Gana +3 puntos de experiencia ");
                    System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                    System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                } else if (alto == 8 || alto == 9) {
                    ptsexp = ptsexp - 6;
                    System.out.println("Cometiste un error grave ");
                    System.out.println("Obtiene un " + alto + "->Pierde -6 puntos de experiencia ");
                    System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                    System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                } else if (alto == 10 || alto == 11) {
                    ptsvd = ptsvd - 8;
                    System.out.println("Acabas de caer en una trampa ");
                    System.out.println("Obtiene un " + alto + "->Pierde -8 puntos de vida ");
                    System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                    System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                } else if (alto == 12) {
                    System.out.println("Un evento especial ocurrira...");

                    evalto = ale.nextInt((evmx - evm + 1)) + evm;
                    System.out.println("**" + evalto + "**");

                    if (evalto == 1) {
                        ptsexp = ptsexp + 10;
                        System.out.println("Encontraste un pergamino antiguo-> Ganas +10 puntos de experiencia ");
                        System.out.println("Sus nuevos puntos de vida son-> " + ptsvd);
                        System.out.println("Sus nuevos puntos de experiencia son -> " + ptsexp);
                    } else if (evalto == 2) {

                        System.out.println("Te infectaste con un veneno -> Empiezas a perder -2 puntos de vida por turno");
                    } else if (evalto == 3) {
                        ptsvd = ptsvd / 2;
                        System.out.println("Un demonion te ataca-> Tu vida se reduce a la mitad ");
                        System.out.println("Sus nuevos puntoss de vida son-> " + ptsvd);
                        System.out.println("Sus nuevos puntos de experiencia son-> " + ptsexp);
                    }
                    System.out.println("""
                            ¿Desea Lanzar el dado?
                            1)Si
                            2)No""");
                    rta = teclado.nextInt();
                    if (rta == 1) {
                        alto = ale.nextInt((max - min + 1)) + min;
                        System.out.println("**" + alto + "**");
                        continue;
                    } else {
                        System.out.println("Gracias por jugar :)");
                    }
                }
            } while (ptsvd >= 0);

        }else {
            System.out.println("Gracias por mirar el juego :)");
        }
    }
}