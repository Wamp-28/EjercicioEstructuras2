import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre, direccion;
        int telefono, saldo, opc, v, r, er;

        System.out.println("Ingrese datos del cliente");
        System.out.println("Nombre:");
        nombre = teclado.nextLine();
        System.out.println("Direccion:");
        direccion = teclado.nextLine();
        System.out.println("Telefono:");
        telefono = teclado.nextInt();
        System.out.println("Saldo:");
        saldo = teclado.nextInt();




        do {
            System.out.println("""
                Menu de opciones
                1. Consignar
                2. Retirar
                3. Extracion rapida 20%
                4. Consultar Saldo
                5. Salir
                """);
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {

                        System.out.println("Ingrese el valor a consignar");
                        v = teclado.nextInt();
                        if(v > 0) {
                            saldo = saldo + v;
                        }else System.out.println("Ingrese un valor valido");

                }
                case 2 -> {
                    System.out.println("Ingrese valor a retirar");
                    r = teclado.nextInt();
                    if (saldo > 0 && saldo > r ) {
                        saldo = saldo - r;
                        System.out.println("Retiro: " + r);
                    } else System.out.println("El retiro debe de ser menor al salodo");
                }
                case 3 -> {
                    System.out.println("Extraccion Rapida");
                    er = (saldo * 20) / 100;
                    System.out.println("Su extraccion rapida fue de:" + er);
                    saldo= saldo-er;
                }
                case 4 -> {
                    System.out.println("Su saldo actual es de:" + saldo);
                }
                default -> {
                    System.out.println("Esa opcion no es valida");
                }


            }
        }while (opc<5);;

        System.out.println("Banco BBVA\n" +
                "Nombre: "+ nombre);
        System.out.println("Direecion:" + direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Saldo:" + saldo);
        System.out.println("***Gracias por utilizar nuestro banco");



    }
}