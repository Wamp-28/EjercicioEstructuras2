import java.util.Scanner;
import java.util.Date;

public class FacturaVenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String telefono;
        Date fecha = new Date();

        System.out.println("**** Tecnologías JDFL A Su Servicio ****\n");

        System.out.print("** Nombre Cliente: ");
        nombre = scanner.nextLine();

        System.out.print("** N° De Telefono Cliente: ");
        telefono = scanner.nextLine();

        int opcion;
        int cantidad;
        int totalCompra = 0;
        String factura = "Producto         Cantidad   Valor Unitario   Subtotal\n";
        factura += "---------------------------------------------------\n";

        System.out.println("\n*** MENÚ DE PRODUCTOS ***");
        System.out.println("1. Mouse -- $80.000");
        System.out.println("2. Teclado -- $320.000");
        System.out.println("3. Monitor -- $940.000");
        System.out.println("4. Disco Duro -- $230.000");
        System.out.println("5. Ram -- $180.000");
        System.out.println("6. Salir");

        do {
            System.out.print("\nSeleccione una opción 1---6: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
                System.out.print("\nSeleccione una opción 1---6: ");
            }

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese la cantidad QUe Desea Comprar: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Ingrese una cantidad válida.");
                    scanner.next();
                    System.out.print("Ingrese la cantidad Que Desea Comprar: ");
                }

                cantidad = scanner.nextInt();

                int precio = 0;
                String producto = "";

                if (opcion == 1) {
                    producto = "Mouse";
                    precio = 80000;
                } else if (opcion == 2) {
                    producto = "Teclado";
                    precio = 320000;
                } else if (opcion == 3) {
                    producto = "Monitor";
                    precio = 940000;
                } else if (opcion == 4) {
                    producto = "Disco Duro";
                    precio = 230000;
                } else if (opcion == 5) {
                    producto = "Ram";
                    precio = 180000;
                }

                int subtotal = precio * cantidad;
                totalCompra += subtotal;

                factura += String.format("%-15s %-9d $%-12d $%-12d\n", producto, cantidad, precio, subtotal);

            } else if (opcion != 6) {
                System.out.println("Error: Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 6);

        double iva = totalCompra * 0.16;
        double totalConIva = totalCompra + iva;

        System.out.println("\n**** FACTURA DE VENTA * Tecnologías JDFL A Su Servicio ****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha: " + fecha);
        System.out.println("\nProductos comprados:");
        System.out.println(factura);
        System.out.println("Subtotal: $" + totalCompra);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Total + IVA: $" + totalConIva);
        System.out.println("Gracias por su compra en Tecnologías JDFL A Su Servicio!");

        scanner.close();
    }
}
