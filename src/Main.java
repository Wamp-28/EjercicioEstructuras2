import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcion1;
        int total;

        do {
            int alt1 = aleatorio.nextInt(0,100);
            int alt2 = aleatorio.nextInt(0,100);
            System.out.println("Los numeros aleatorios son: " + alt1 + " y " + alt2);
            System.out.println("""
                            Calculadora aleatoria
                            1.SUMA
                            2.RESTA
                            3.MULTIPLICACION
                            4.DIVISION
                            5.EXPONENCIAL
                            6.MODULO
                            7.SALIR
                            """);
            opcion1 = scanner.nextInt();

            switch (opcion1) {

                case 1:
                    System.out.println("SUMA");
                    total=alt1+alt2;
                    System.out.println("La suma de: "+alt1+"+"+alt2+" da como resultado "+total);
                    break;


                case 2:
                    System.out.println("Resta");
                    total=alt1-alt2;
                    System.out.println("La resta de: "+alt1+"-"+alt2+" da como resultado "+total);
                    break;


                case 3:
                    System.out.println("Multiplicacion");
                    total=alt1*alt2;
                    System.out.println("La multiplicacion de: "+alt1+"x"+alt2+" da como resultado "+total);
                    break;


                case 4:
                    System.out.println("Division");
                    total=alt1/alt2;
                    System.out.println("La Division de: "+alt1+"/"+alt2+" da como resultado "+total);
                    break;

                case 5:
                    System.out.println("Exponencial");
                    total=alt1*alt2;
                    System.out.println("El numero elevado da como resultado:" + Math.pow((double)alt1, (double)alt2));
                    break;


                case 6:
                    System.out.println("Modulo o Residuo");
                    total=alt1%alt2;
                    System.out.println("La Division de: "+alt1+"/"+alt2+" da como residuo "+total);
                    break;
            }
        }
        while (opcion1 != 7) ;
    }

}