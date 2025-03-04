import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcion1, opcion2, opcion3, dinero = 0;

        do {

            System.out.println("-----APUESTAS Y GANA-----\n");
            System.out.println("Seleccione una opción");
            System.out.println("1. Recargar dinero");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            opcion1 = scanner.nextInt();

            switch (opcion1) {

                case 1:
                    System.out.println("Ingrese cantidad de dinero");
                    dinero += scanner.nextInt();
                    break;


                case 2:
                    System.out.println("1. Iniciar");
                    System.out.print("2. Salir\n");
                    opcion2 = scanner.nextInt();

                    if(opcion2==1){
                        opcion3=aleatorio.nextInt(1,4);
                        if(opcion3==1){
                            dinero = dinero *2;
                            System.out.println("Su dinero se a duplicado, ahora su monto es de: " + dinero);
                        }
                        else if(opcion3==2){
                            dinero = dinero /2;
                            System.out.println("Ha perdido la mitad de su dinero, ahora su monto de dinero es: " + dinero);
                        }
                        else if(opcion3==3){
                            dinero=0;
                            System.out.println("Ha perdido todo su dinero, recargue nuevamente :(");
                        }

                    }
                    else
                        break;

            }
        }
        while (opcion1 != 3) ;
    }

}