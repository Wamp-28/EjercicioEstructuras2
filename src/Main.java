import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random alet = new Random();
        int pv = 15;
        int exp = 0;
        int max = 12;
        int min = 1;
        int max2 = 3;
        int min2 = 1;
        int r;
        int t;

        do{
             r = alet.nextInt(max - min + 1) + min;
            System.out.println("++" +r+ "++");

             if (r == 1 || r ==2){
                    System.out.println("Encontraste un fuente de vida");
                    pv = pv + 1;
                    System.out.println("Tienes "+pv+" puntos de vida");
                    System.out.println("Tu experiencia es de: "+exp);

                }

             if (r == 3 || r == 4 || r==5) {
                    System.out.println("Eres atacado brutalmente");
                    pv = pv - 5;
                 System.out.println("Tienes "+pv+" puntos de vida");
                 System.out.println("Tu experiencia es de: "+exp);
             }
             if (r == 6 || r == 7){
                    System.out.println("Ganaste experiencia de la aventuta");
                    exp = exp + 3;
                 System.out.println("Tienes "+pv+" puntos de vida");
                 System.out.println("Tu experiencia es de: "+exp);
                }
             if (r == 8 || r == 9){
                    System.out.println("Cometes un error grave");
                    exp = exp - 6;
                 System.out.println("Tienes "+pv+" puntos de vida");
                 System.out.println("Tu experiencia es de: "+exp);
                }

             if (r == 10 || r == 11){
                    System.out.println("Caes en una trampa mortal");
                    pv = pv - 8;
                 System.out.println("Tienes "+pv+" puntos de vida");
                 System.out.println("Tu experiencia es de: "+exp);
                }

             if (r == 12){
                    System.out.println("Evento especial aleatorio");
                    t = alet.nextInt(max2 - min2 + 1) + min2;
                    if (t==1){
                        System.out.println("Encuentras un pergamino sagrado");
                        exp = exp + 10;
                        System.out.println("Tienes "+pv+" puntos de vida");
                        System.out.println("Tu experiencia es de: "+exp);
                    }else if (t==2){
                        System.out.println("Te infectas con veneno");
                        pv = pv - 2;
                        System.out.println("Tienes "+pv+" puntos de vida");
                        System.out.println("Tu experiencia es de: "+exp);
                    } else if (t==3){
                        System.out.println("Un demoni te ataca");
                        pv = pv / 2;
                        System.out.println("Tienes "+pv+" puntos de vida");
                        System.out.println("Tu experiencia es de: "+exp);

                    }
                }

        }while(pv>0 || pv >= 50);

        if (pv <= 0){
            System.out.println("Has muerto");
        } else if (pv >= 50){
            System.out.println("Has ganado, pusiste escapar de la dimencion");
        }
    }
}