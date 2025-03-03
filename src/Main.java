import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();


        int ini;
        int max = 3;
        int min = 1;
        int res;
        int opc;
        int max1 = 3;
        int min1 = 1;

        int max2 = 3;
        int min2 = 1;

        int res1;
        int res2;

        do {

            do {

                System.out.println("MONTO INICIAL:");
                ini = teclado.nextInt();
                if (ini <= 0) {
                    System.out.println("INGRESE UN MONTO VALIDO\n");
                }
            } while (ini <= 0);
            res = ale.nextInt((max - min + 1)) + min;

            if (res == 1) {
                ini = ini * 2;
                System.out.println("EL RESULTADO ES: " + res + "\n");
                System.out.println("¡FELICIDADES! LA SUERTE ESTÁ DE TU LADO, HAS DUPLICADO TU DINERO\n");
                System.out.println("SALDO TOTAL: " + ini);
                while (ini > 0) {
                    System.out.println("""
                            
                            ***** QUIERES SEGUIR JUGANDO *****
                            1.SI
                            2.NO
                            """);
                    System.out.println("INGRESE LA OPCION");
                    opc = teclado.nextInt();

                    switch (opc) {
                        case 1 -> {
                            res1 = ale.nextInt((max1 - min1 + 1)) + min1;

                            if (res1 == 1) {
                                ini = ini * 2;
                                System.out.println("HAZ VUELTO A MULTIPLICAR TU SALDO, FELICITACIONES!!\n");
                            } else if (res1 == 2) {
                                ini = ini / 2;
                                System.out.println("PERDISTE LA MITAD DE TU SALDO \n");
                            } else if (res1 == 3) {
                                ini = 0;
                                System.out.println("HAZ PERDIDO TODO :)\n");
                            }

                            System.out.println("SALDO TOTAL: " + ini + "\n");
                        }
                        case 2 -> {
                            System.out.println("GRACIAS POR JUGAR. TU SALDO FINAL ES: " + ini + "\n");
                            return;
                        }
                        default -> System.out.println("INGRESA UNA OPCIÓN VÁLIDA.");
                    }

                }
            } else if (res == 2) {
                ini = ini / 2;
                System.out.println("EL RESULTADO ES: " + res + "\n");
                System.out.println("APOSTASTE FUERTE Y PERDISTE LA MITAD DE TU SALDO. \n");
                System.out.println("SALDO TOTAL: " + ini);

                while (ini > 0) {
                    System.out.println("""
                            
                            ***** ¿INTENTAS RECUPERARTE O TE RETIRAS A TIEMPO? *****
                            1. SI
                            2. NO
                            """);
                    System.out.println("INGRESE LA OPCIÓN:");
                    opc = teclado.nextInt();

                    switch (opc) {
                        case 1 -> {
                            res2 = ale.nextInt((max2 - min2 + 1)) + min2;
                            if (res2 == 1) {
                                ini = ini * 2;
                                System.out.println("HAZ MULTIPLICADO TU SALDO\n");
                            } else if (res2 == 2) {
                                ini = ini / 2;
                                System.out.println("HAZ VUELTO A PERDER LA MITAD DE TU SALDO\n");
                            } else if (res2 == 3) {
                                ini = 0;
                                System.out.println("HAZ PERDIDO TODO :)\n");
                            }
                            System.out.println("SALDO TOTAL: \n" + ini);
                        }

                        case 2 -> {
                            System.out.println("GRACIAS POR JUGAR. TU SALDO FINAL ES: \n" + ini);
                            return;
                        }
                        default -> System.out.println("INGRESA UNA OPCIÓN VÁLIDA.");
                    }
                }
            } else if (res == 3) {
                ini = 0;
                System.out.println("***** LA SUERTE NO ESTUVO DE TU LADO... HAS PERDIDO TODO TU SALDO. *****\n");
                System.out.println("***** NO TIENES MAS SALDO. FIN DEL JUEGO. *****");
                return;
            }

        } while (ini > 0);
        teclado.close();
    }
}