import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, fecha;
        double telefono;
        int opcion;
        int productoSeleccionado;
        double totalCompra = 0;
        String productosComprados = "";

        System.out.println("Productos");
        System.out.println("1. Mouse = 80.000");
        System.out.println("2. Teclado = 320.000");
        System.out.println("3. Monitor = 940.000");
        System.out.println("4. Disco duro = 230.000");
        System.out.println("5. RAM = 180.000");

        System.out.println("\nPor favor ingrese los siguientes datos:");

        System.out.print("Nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Fecha: ");
        fecha = teclado.nextLine();

        System.out.print("Teléfono: ");
        telefono = teclado.nextDouble();


        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Comprar");
            System.out.println("2. Ver factura y salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("\nSeleccione un producto (Digite entre 1 y 5) : ");
                productoSeleccionado = teclado.nextInt();

                if (productoSeleccionado == 1) {
                    totalCompra += 80000;
                    productosComprados += "Mouse = 80.000\n";
                    System.out.print("Ha comprado un mouse\n");
                } else if (productoSeleccionado == 2) {
                    totalCompra += 320000;
                    productosComprados += "Teclado = 320.000\n";
                    System.out.print("Ha comprado un teclado \n");
                } else if (productoSeleccionado == 3) {
                    totalCompra += 940000;
                    productosComprados += "Monitor = 940.000\n";
                    System.out.print("Ha comprado un monitor\n");
                } else if (productoSeleccionado == 4) {
                    totalCompra += 230000;
                    productosComprados += "Disco duro = 230.000\n";
                    System.out.print("Ha comprado un disco duro\n");
                } else if (productoSeleccionado == 5) {
                    totalCompra += 180000;
                    productosComprados += "RAM = 180.000\n";
                    System.out.print("Ha comprado una RAM\n");
                } else {
                    System.out.println("Numero incorrecto, seleccione un número entre 1 y 5.");
                }
            }

        } while (opcion != 2);


        System.out.println("\nFACTURA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Teléfono: " + telefono);
        System.out.println("\nProductos comprados:\n" + productosComprados);
        System.out.println("Total a pagar: $" + totalCompra);

        teclado.close();
    }
}