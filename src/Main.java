import

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        String nombre, fecha;

        int tel, opc, num, numm, numt, nummo, numd, numr;
        int valt = 0;
        int valte = 320000;
        int valm = 80000;
        int valmo = 940000;
        int valdi = 230000;
        int valr = 180000;


        System.out.println("--DIGITE SUS DATOS--");
        System.out.println("Nombre: ");
        nombre = Teclado.next();
        System.out.println("Ingrese su número telefonico");
        tel = Teclado.nextInt();
        System.out.println("Ingrese la fecha: DIA // MES // AÑO");
        fecha = Teclado.nextLine();

        do {
            System.out.println("""
                    CATALOGO:
                    1) Mouse = 80.000
                    2)Teclado = 320.000
                    3)Monitor = 940.000
                    4)Discos duros = 230.000
                    5)RAM = 180.000
                    6)SALIDA
                    
                    
                    
                    
                    
                    """);
            opc = Teclado.nextInt();

            switch (opc) {

                case 1 -> {
                    System.out.println("Número de mouse que quiere comprar: ");
                    numm = Teclado.nextInt();
                    valt = (numm + valm);
                }

                case 2 -> {
                    System.out.println("Numero de teclados que desea comprar");
                    numt = Teclado.nextInt();
                    valt = (numt + valte);
                }
                case 3 -> {
                    System.out.println("Numero de monitores que desea comprar");
                    nummo = Teclado.nextInt();
                    valt = (nummo + valmo);
                }

                case 4 -> {
                    System.out.println("Numero de discos que desea comprar");
                    numd = Teclado.nextInt();
                    valt = (numd + valdi);
                }
                case 5 -> {
                    System.out.println("Número de memorias ram que desea comprar");
                    numr = Teclado.nextInt();
                    valt = (numr + valr );
                }

            }
        }

   }
}