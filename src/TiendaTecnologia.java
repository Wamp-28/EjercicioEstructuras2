import java.util.Scanner;

public class TiendaTecnologia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int precioMouse = 80000;
        int precioTeclado = 320000;
        int precioMonitor = 940000;
        int precioDiscoDuro = 230000;
        int precioRam = 180000;

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
        String fecha = scanner.nextLine();

        int cantidadMouse = 0, cantidadTeclado = 0, cantidadMonitor = 0, cantidadDiscoDuro = 0, cantidadRam = 0;
        int totalCompra = 0;
        String continuar;

        do {
            System.out.println("\n---- Tienda de Tecnología ----");
            System.out.println("1. Mouse - $80,000");
            System.out.println("2. Teclado - $320,000");
            System.out.println("3. Monitor - $940,000");
            System.out.println("4. Disco Duro - $230,000");
            System.out.println("5. Memoria RAM - $180,000");
            System.out.println("6. salir");
            System.out.print("Seleccione un producto: ");
            int opcion = scanner.nextInt();

            if (opcion == 6) {
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            if (opcion == 1) {
                cantidadMouse += cantidad;
                totalCompra += cantidad * precioMouse;
            } else if (opcion == 2) {
                cantidadTeclado += cantidad;
                totalCompra += cantidad * precioTeclado;
            } else if (opcion == 3) {
                cantidadMonitor += cantidad;
                totalCompra += cantidad * precioMonitor;
            } else if (opcion == 4) {
                cantidadDiscoDuro += cantidad;
                totalCompra += cantidad * precioDiscoDuro;
            } else if (opcion == 5) {
                cantidadRam += cantidad;
                totalCompra += cantidad * precioRam;
            } else {
                System.out.println("Opción no válida.");
            }

        } while (true);

        System.out.println("  FACTURA ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha: " + fecha);

        if (cantidadMouse > 0)
            System.out.println("Mouse: " + cantidadMouse + " x $" + precioMouse + " = $" + (cantidadMouse * precioMouse));
        if (cantidadTeclado > 0)
            System.out.println("Teclado: " + cantidadTeclado + " x $" + precioTeclado + " = $" + (cantidadTeclado * precioTeclado));
        if (cantidadMonitor > 0)
            System.out.println("Monitor: " + cantidadMonitor + " x $" + precioMonitor + " = $" + (cantidadMonitor * precioMonitor));
        if (cantidadDiscoDuro > 0)
            System.out.println("Disco Duro: " + cantidadDiscoDuro + " x $" + precioDiscoDuro + " = $" + (cantidadDiscoDuro * precioDiscoDuro));
        if (cantidadRam > 0)
            System.out.println("RAM: " + cantidadRam + " x $" + precioRam + " = $" + (cantidadRam * precioRam));

        System.out.println("TOTAL DE TODAS LAS COMPRAS: $" + totalCompra);
        System.out.println("Gracias por su compra");

        scanner.close();
    }
}