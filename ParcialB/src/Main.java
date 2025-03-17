import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();


        int vida = 15;
        int experiencia = 0;
        boolean envenenado = false;



        System.out.println("Bienvenido al juego, tienes que alcanzar 50 puntos de experiencia antes de perder todas tus vidas");

        while (vida > 0 && experiencia < 50){
            int dado = random.nextInt(12) + 1;

            int eventoEsp = random.nextInt(3);


            switch (dado){

                case 1, 2 ->{
                    vida += 1;
                    System.out.println("Encontraste una fuente de vida, tienes 1 punto mas de vida");

                }

                case 3, 4, 5 ->{

                    vida -= 5;
                    System.out.println("Eres atacado brutalmente, pierdes 5 puntos de vida");
                }

                case 6, 7 ->{
                    experiencia += 3;
                    System.out.println("Ganaste +3 de experiencia en la aventura");

                }

                case 8, 9 ->{
                    experiencia -= 6;
                    System.out.println("Cometiste un error grave, pierdes 6 puntos de experiencia");
                }

                case 10, 11 ->{
                    vida -=8;
                    System.out.println("Caes en una trampa letal, pierdes 8 puntos de vida");
                }

                case 12 ->{
                    System.out.println("Evento especial: ");

                    switch (eventoEsp){
                        case  0 ->  {
                            System.out.println("Encuentras un pergamino antiguo, Ganas 10 puntos de experiencia");
                            experiencia += 10;

                        }

                        case 1->{
                            System.out.println("Te infectas con veneno, empiezas a perder 2 puntos de vida por turno");
                            vida -= 2;
                        }

                        case 2 -> {
                            System.out.println("Un demonio te ataca, tu vida se reduce a la mitad");
                            vida /= 2;
                        }
                    }
                }

            }

            if (envenenado){
                vida-=2;
                System.out.println("Pierdes 2 puntos de vida por el veneno");
            }



        System.out.println("Vidas: " + vida + " Experiencia: " + experiencia);
        System.out.println(" presiona enter para continuar");
        teclado.nextLine();
        }

        if (vida <= 0){
            System.out.println("Has muerto, fin del juego");

        }else {
            System.out.println("Felicidades has alcanzado los 50 puntos de experiencia");
        }







        }
    }
