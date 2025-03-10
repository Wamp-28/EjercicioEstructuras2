import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tel, opc, precio,cantidad, total;
        int totalPagar = 0;
        double totalIva, impuesto;
        String nom, fch, factura, producto;


        System.out.println("\n ***** BIENVENIDO A TU TIENDA TECNOLOGICA  ***** \n");
        System.out.print("INGRESE SU NOMBRE: ");
        nom = teclado.nextLine();
        System.out.print("INGRESE LA FECHA: ");
        fch = teclado.nextLine();
        System.out.print("INGRESE SU TELEFONO: ");
        tel = teclado.nextInt();
        teclado.nextLine();

        factura = "\n-------------------------------------------------\n" +
                "|               ***** FACTURA *****              |\n" +
                "-------------------------------------------------\n" +
                "Cliente: " + nom + "\n" +
                "Fecha: " + fch + "\n" +
                "Teléfono: " + tel + "\n" +
                "-------------------------------------------------\n" +
                "Producto | Cantidad | Valor Unitario | Valor Total\n" +
                "-------------------------------------------------\n";

        do {
            System.out.println("""
                    \n***** MENÚ PRINCIPAL *****
                    1. MOUSE: $ 80.000.
                    2. TECLADO: $320.000.
                    3. MONITOR: $940.000.
                    4. DISCO DURO: $230.000.
                    5. RAM: $180.000.
                    6. FINALIZAR COMPRA Y MOSTRAR FACTURA.
                    """);
            System.out.print("INGRESE LA OPCIÓN: ");
            opc = teclado.nextInt();

            if (opc >= 1 && opc <= 5) {
                System.out.print("¿CUÁNTAS UNIDADES DESEAS COMPRAR? ");
                 cantidad = teclado.nextInt();
                 precio = switch (opc) {
                    case 1 -> 80000;
                    case 2 -> 320000;
                    case 3 -> 940000;
                    case 4 -> 230000;
                    case 5 -> 180000;
                    default -> 0;
                };
                 total = cantidad * precio;
                totalPagar += total;
                 producto = switch (opc) {
                    case 1 -> "MOUSE";
                    case 2 -> "TECLADO";
                    case 3 -> "MONITOR";
                    case 4 -> "DISCO DURO";
                    case 5 -> "RAM";
                    default -> "";
                };
                factura += producto + " | " + cantidad + " | $" + precio + " | $" + total + "\n";
                System.out.println("**** COMPRA EXITOSA ****");
            } else if (opc == 6) {
                 impuesto = totalPagar * 0.16;
                 totalIva = totalPagar + impuesto;
                System.out.println(factura);
                System.out.println("-------------------------------------------------");
                System.out.println("TOTAL SIN IMPUESTO: $" + totalPagar);
                System.out.println("IVA (16%): $" + impuesto);
                System.out.println("TOTAL A PAGAR: $" + totalIva);
                System.out.println("-------------------------------------------------");
                System.out.println("|      GRACIAS POR SU COMPRA EN NUESTRA TIENDA  |");
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("\n ***** OPCIÓN NO VÁLIDA. INTENTA DE NUEVO. *****");
            }
        } while (opc != 6);

        teclado.close();
    }
}
