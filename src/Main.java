import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int consignacion;
        int retiro;
        double extraccion;
        int opcion;
        int saldo;
        String nombreCliente;
        int telefonoCliente;
        String direccionCliente;

        System.out.println("Ingrese su nombre: ");
        nombreCliente = teclado.nextLine();

        System.out.println("Ingrese su teléfono: ");
        telefonoCliente = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese su dirección: ");
        direccionCliente = teclado.nextLine();

        System.out.println("Bienvenido a su banco, por favor ingrese su saldo inicial: ");
        saldo = teclado.nextInt();

        do {
            System.out.println("""
                Menú de opciones:
                1: Consignar
                2: Retirar
                3: Extracción rápida (20%)
                4: Consultar saldo
                5: Salir""");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Cuánto dinero quiere consignar?");
                    consignacion = teclado.nextInt();
                    saldo += consignacion;
                    System.out.println("Su nuevo saldo es: " + saldo);
                }
                case 2 -> {
                    System.out.println("¿Cuánto dinero quiere retirar?");
                    retiro = teclado.nextInt();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Su nuevo saldo es: " + saldo);
                    }
                }
                case 3 -> {
                    extraccion = saldo * 0.2;
                    if (extraccion > saldo) {
                        System.out.println("Saldo insuficiente para extracción rápida.");
                    } else {
                        saldo -= extraccion;
                        System.out.println("Ha retirado: " + extraccion);
                        System.out.println("Su nuevo saldo es: " + saldo);
                    }
                }
                case 4 -> System.out.println("Su saldo es: " + saldo);
                case 5 -> {
                    System.out.println("""
                        Saliste de tu cuenta bancaria
                        Nombre: """ + nombreCliente);
                    System.out.println("Teléfono: " + telefonoCliente);
                    System.out.println("Dirección: " + direccionCliente);
                    System.out.println("Saldo: " + saldo);
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);


    }
}
