import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingresa tu dirección: ");
        String direccion = teclado.nextLine();

        System.out.print("Ingresa tu teléfono: ");
        String telefono = teclado.nextLine();

        System.out.print("Ingresa tu saldo: ");
        double saldo = teclado.nextDouble();

        int opc;

        do {
            System.out.println("""
                    1. Consignar;
                    2. Retirar;
                    3. Extracción rápida;
                    4. Consultar saldo;
                    5. Salir);
                           """);

            System.out.print("Ingrese una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("¿Cuánto desea consignar?: ");
                    double montoC = teclado.nextDouble();
                    saldo += montoC;
                    System.out.println("Consignación exitosa, nuevo saldo: " + saldo);
                    break;

                case 2:
                    System.out.print("¿Cuánto desea retirar?: ");
                    double montoR = teclado.nextDouble();
                    saldo -= montoR;
                    System.out.println("Retiro exitoso, nuevo saldo: " + saldo);
                    break;

                case 3:
                    System.out.print("Extracción del 20% del saldo: ");
                    double montoE = saldo * 0.2;
                    saldo -= montoE;
                    System.out.println("Retiro exitoso, nuevo saldo: " + saldo);
                    break;

                case 4:
                    System.out.println("Saldo actual: " + saldo);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opc != 5);
    }
}
