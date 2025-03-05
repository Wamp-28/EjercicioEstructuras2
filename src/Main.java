import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, direccion;
        long celular;
        double saldo;
        int opcion;

        System.out.println("Por favor digite sus datos personales");

        System.out.print("Nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Dirección: ");
        direccion = teclado.nextLine();

        System.out.print("Celular: ");
        celular = teclado.nextLong();

        System.out.print("Saldo inicial: ");
        saldo = teclado.nextDouble();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Celular: " + celular);
        System.out.println("Saldo: " + saldo);

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Extracción rápida (20%)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el dinero a consignar: ");
                    double consignacion = teclado.nextDouble();
                    if (consignacion > 0) {
                        saldo += consignacion;
                        System.out.println("Consignación exitosa. Saldo actual: " + saldo);
                    } else {
                        System.out.println("Consignación inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite el dinero a retirar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo actual: " + saldo);
                    } else {
                        System.out.println("Retiro inválido. Verifique el monto.");
                    }
                    break;

                case 3:
                    double extraccion = saldo * 0.20;
                    if (extraccion <= saldo) {
                        saldo -= extraccion;
                        System.out.println("Extracción rápida realizada. Saldo actual: " + saldo);
                    } else {
                        System.out.println("No tiene suficiente saldo para esta operación.");
                    }
                    break;

                case 4:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 5);

        teclado.close();
    }
}