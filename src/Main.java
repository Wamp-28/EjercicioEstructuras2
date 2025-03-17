import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int lanzar;
        int resultado;
        int resultado2;
        int max=12;
        int min=1;
        int max2=3;
        int min2=1;
        int vida=15;
        int experiencia=0;
        boolean veneno=false;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a tu aventura guerrero si quieres escapar debes obtener 50 puntos de experiencia");
        System.out.println("-------------------------------------------------------------------------------------------");
        do {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("¡Arroja el dado para obtener un resultado!");
            System.out.println("presiona cualquier numero para arojar el dado: ");
            System.out.println("-------------------------------------------------------------------------------------------");
            lanzar = teclado.nextInt();
            resultado = ale.nextInt((max - min + 1)) + min;
            switch (resultado) {
                case 1, 2 -> {
                    System.out.println("sacaste un: " + resultado);
                    System.out.println("¡Encontraste uan fuente de vida!");
                    System.out.println("+1 punto de vida\n");
                    vida = vida + 1;
                    if (veneno == true) {
                        System.out.println("El veneno te resta 2 puntos de vida");
                        vida = vida - 2;
                    }
                }
                case 3, 4, 5 -> {
                    System.out.println("sacaste un: " + resultado);
                    System.out.println("¡Un enemigo te ataco brutalmente!");
                    System.out.println("-5 puntos de vida\n");
                    vida = vida - 5;
                    if (veneno == true) {
                        System.out.println("El veneno te resta 2 puntos de vida");
                        vida = vida - 2;
                    }
                }
                case 6, 7 -> {
                    System.out.println("sacaste un: " + resultado);
                    System.out.println("¡Haz ganado experiencia!");
                    System.out.println("+3 puntos de experiencia\n");
                    experiencia = experiencia + 3;
                    if (veneno == true) {
                        System.out.println("El veneno te resta 2 puntos de vida");
                        vida = vida - 2;
                    }
                }
                case 8, 9 -> {
                    System.out.println("sacaste un: " + resultado);
                    System.out.println("¡Oh no! cometiste un error y te has accidentado");
                    System.out.println("-6 puntos de vida\n");
                    vida = vida - 6;
                    if (veneno == true) {
                        System.out.println("El veneno te resta 2 puntos de vida");
                        vida = vida - 2;
                    }
                }
                case 10, 11 -> {
                    System.out.println("sacaste un: " + resultado);
                    System.out.println("¡Caiste en una trampa!");
                    System.out.println("-8 puntos de vida\n");
                    vida = vida - 8;
                    if (veneno == true) {
                        System.out.println("El veneno te resta 2 puntos de vida");
                        vida = vida - 2;
                    }
                }
                case 12 -> {
                    resultado2 = ale.nextInt((max - min + 1)) + min;
                    if (resultado2 == 1) {
                        System.out.println("sacaste un: " + resultado2);
                        System.out.println("encontraste un pergamino antiguo");
                        System.out.println("+10 puntos de experiencia\n");
                        experiencia = experiencia + 10;
                        if (veneno == true) {
                            System.out.println("El veneno te resta 2 puntos de vida");
                            vida = vida - 2;
                        }
                    } else if (resultado2 == 2) {
                        System.out.println("sacaste un: " + resultado2);
                        System.out.println("Te has infectado con veneno");
                        System.out.println("-2 puntos de vida por turno\n");
                        vida = vida - 2;
                        veneno = true;
                    } else if (resultado2 == 3) {
                        System.out.println("sacaste un: " + resultado2);
                        System.out.println("¡Un gran demonio te ataca!");
                        System.out.println("Tu vida se reduce a la mitad\n");
                        vida = vida / 2;
                        if (veneno == true) {
                            System.out.println("El veneno te resta 2 puntos de vida");
                            vida = vida - 2;
                        }
                    }
                }

            }
        }while(vida>0);
        if(vida<=0){
            System.out.println("***HAS MUERTO***");
        }
    }
}