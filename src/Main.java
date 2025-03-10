import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, telefono, fecha;
        int opcion, cantidad;
        double precio, subtotal = 0, iva, total;
        String factura = "\nProducto   Cant   V. Unit   V. Total\n";

        System.out.println("""
                                                               *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                                                               Bienvenido a la Tienda de Tecnología donde juanchito
                                                               *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
        """);
        System.out.print("""
                                                                               *-*-*-*-*-*-*-*-*-*
                                                                               Ingrese su nombre: 
                                                                               *-*-*-*-*-*-*-*-*-*
        """);
        nombre = teclado.nextLine();
        System.out.print("""
                                                                              *-*-*-*-*-*-*-*-*-*-*
                                                                              Ingrese su teléfono: 
                                                                              *-*-*-*-*-*-*-*-*-*-*
        """);
        telefono = teclado.nextLine();
        System.out.print("""
                                                                         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                                                                         Ingrese la fecha (dd/mm/aaaa): 
                                                                         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
        """);
        fecha = teclado.nextLine();

        do {
            System.out.println("                     \n                    *-*- Menú de Productos -*-*");
            System.out.println("""
                                                                                -*-*-*-*-*-*-*-*-*
                                                                                1. Mouse - $80.000
                                                                                -*-*-*-*-*-*-*-*-*
            """);
            System.out.println("""
                                                                              -*-*-*-*-*-*-*-*-*-*-
                                                                              2. Teclado - $320.000
                                                                              -*-*-*-*-*-*-*-*-*-*-
            """);
            System.out.println("""
                                                                              -*-*-*-*-*-*-*-*-*-*-
                                                                              3. Monitor - $940.000
                                                                              -*-*-*-*-*-*-*-*-*-*-
            """);
            System.out.println("""
                                                                            -*-*-*-*-*-*-*-*-*-*-*-*
                                                                            4. Disco Duro - $230.000
                                                                            -*-*-*-*-*-*-*-*-*-*-*-*
            """);
            System.out.println("""
                                                                                -*-*-*-*-*-*-*-*-
                                                                                5. RAM - $180.000
                                                                                -*-*-*-*-*-*-*-*-
            """);
            System.out.println("""
                                                                                     -*-*-*-*
                                                                                     6. Salir
                                                                                     -*-*-*-*
            """);
            System.out.print("""
                                                                              -*-*-*-*-*-*-*-*-*-*-*-
                                                                              Seleccione una opción: 
                                                                              -*-*-*-*-*-*-*-*-*-*-*-
            """);
            opcion = teclado.nextInt();

            precio = 0;
            String producto = "";

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("""
                                                                          *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                                                                          Ingrese la cantidad de unidades: 
                                                                          *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """);
                cantidad = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        producto = "Mouse";
                        precio = 80000;
                        break;
                    case 2:
                        producto = "Teclado";
                        precio = 320000;
                        break;
                    case 3:
                        producto = "Monitor";
                        precio = 940000;
                        break;
                    case 4:
                        producto = "Disco Duro";
                        precio = 230000;
                        break;
                    case 5:
                        producto = "RAM";
                        precio = 180000;
                        break;
                }

                double valorTotal = cantidad * precio;
                subtotal += valorTotal;


                factura += String.format("%-10s %-4d %-8.2f %-8.2f\n", producto, cantidad, precio, valorTotal);
                System.out.println("Compra realizada: " + cantidad + " unidades - $" + valorTotal);
            } else if (opcion != 6) {
                System.out.println("""
                                                                  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                                                  x Opción no válida. Intente de nuevo. x
                                                                  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
            """);
            }

        } while (opcion != 6);

        iva = subtotal * 0.16;
        total = subtotal + iva;

        System.out.println("\n                                           *-*- Factura de Compra -*-*");
        System.out.println("""
                                                                                   *-*-*-*-
                                                                                   Nombre: 
                                                                                   *-*-*-*-
        """ + nombre);
        System.out.println("""
                                                                                   *-*-*
                                                                                   Tel: 
                                                                                   *-*-*
        """ + telefono);
        System.out.println("""
                                                                                  *-*-*-*
                                                                                  Fecha: 
                                                                                  *-*-*-*
        """ + fecha);
        System.out.println("----------------------------------");
        System.out.println(factura);
        System.out.println("----------------------------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA (16%%): $%.2f\n", iva);
        System.out.printf("Total: $%.2f\n", total);
        System.out.println("""
                                                           *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                                           Gracias por su compra. ¡Vuelva pronto a donde juanchito!
                                                           *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
        """);

        teclado.close();
    }
}


