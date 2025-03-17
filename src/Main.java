import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int min = 1;
        int max = 12;
        int minCE = 1;
        int maxCE =3;
        int dado,dado1;
        int vida = 15;
        int turno = 1;
        int experiencia = 0;
       int opc;

        dado = aleatorio.nextInt((max - min + 1)) + min;
        do{
        System.out.println("BIENVENIDO A SURVIVE MAGIC");
            System.out.println("Turno "+ turno);
            turno++;
            System.out.println("Esperiemcia: "+experiencia);
            System.out.println("Vida :"+ vida);
        System.out.println("Comencemos, Te salio un "+dado);
        if(dado == 1 || dado == 2){
            System.out.println("Enconstraste una fuente que te otorga vida (+1 punto de vida");
            vida++;
            System.out.println("Esperiemcia: "+experiencia);
            System.out.println("Vida :"+ vida);
            System.out.println("1 Para seguir lanzanco el dado");
            opc = teclado.nextInt();
            if(opc == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;

            }continue;



        }else if(dado == 3 || dado == 4 || dado == 5){
            System.out.println("Eres atacado brutalmente (-5 puntos de vida) ");
            vida = vida -5;
            System.out.println("Esperiemcia: "+experiencia);
            System.out.println("Vida :"+ vida);
            System.out.println("1 Para seguir lanzanco el dado");
            opc = teclado.nextInt();
            if(opc == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;

            }continue;
        } else if (dado == 6 || dado == 7) {
            System.out.println("Ganas experiencia en la aventura (+3 puntos de experienca");
            experiencia = experiencia + 3;
            System.out.println("1 Para seguir lanzanco el dado");
            opc = teclado.nextInt();
            if(opc == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;

            }continue;
        }else if(dado == 8 || dado == 9){
            System.out.println("Upsss, Cometiste un error grave (-6 puntos de experiencia");
            experiencia = experiencia-6;
            System.out.println("Esperiemcia: "+experiencia);
            System.out.println("Vida :"+ vida);
            System.out.println("1 Para seguir lanzanco el dado");
            opc = teclado.nextInt();
            if(opc == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;

            }continue;
        }else if(dado == 10 || dado == 11){
            System.out.println("Caes en una trampa letal (-8 puntos de vida)");
            vida = vida - 8;
            System.out.println("Esperiemcia: "+experiencia);
            System.out.println("Vida :"+ vida);
            System.out.println("1 Para seguir lanzanco el dado");
            opc = teclado.nextInt();
            if(opc == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;

            }continue;
        }else{
            System.out.println("Evento especial aleatorio (puede ser bueno o malo");
            dado1 = aleatorio.nextInt((maxCE - minCE + 1)) + minCE;
            System.out.println("Obtuviste un "+dado1);
            if(dado1 == 1){
                System.out.println("Encuentras un pergamino antiguo (+10 puntos de experiencia)");
                experiencia = experiencia + 10;
                System.out.println("Esperiemcia: "+experiencia);
                System.out.println("Vida :"+ vida);
            }else if(dado1 == 2){
                vida--;

            }else{
                System.out.println("Un demonio te ataca (Tu vida se reduce a la mitad");
                vida = vida/2;
                System.out.println("Esperiemcia: "+experiencia);
                System.out.println("Vida :"+ vida);
            }

        }

        }while (vida>=0 );

    }
}