import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int precioMouse = 80000;
        int precioTeclado = 320000;
        int precioMonitor = 940000;
        int precioDisco = 230000;
        int precioRam = 180000;
        int cant;
        int opcion;
        String nombreCliente;
        int telefonoCliente;
        String fecha;

        double IVA = 0.16;
        int compra = 0;
        double ivaCalculado;
        double totalConIva;

        System.out.println("Ingrese su nombre: ");
        nombreCliente = teclado.next();

        System.out.println("Ingrese su teléfono: ");
        telefonoCliente = teclado.nextInt();

        System.out.println("Ingrese la fecha: ");
        fecha = teclado.next();

        System.out.println("Bienvenido a la tienda, a continuación el menú de opciones: ");

        do {
            System.out.println("""  
                    ¿Qué desea comprar?  
                    1: Teclados - $320.000  
                    2: Mouse - $80.000  
                    3: Monitor - $940.000  
                    4: Discos duros - $230.000  
                    5: RAM - $180.000   
                    6: Salir""");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Cuántos teclados quiere comprar?");
                    cant = teclado.nextInt();
                    if (cant <= 0) {
                        System.out.println("Cantidad no válida");
                    } else {
                        compra += precioTeclado * cant;
                        System.out.println("El valor de su compra actual es: " + compra);
                    }
                }
                case 2 -> {
                    System.out.println("¿Cuántos mouse quiere comprar?");
                    cant = teclado.nextInt();
                    if (cant <= 0) {
                        System.out.println("Cantidad no válida");
                    } else {
                        compra += precioMouse * cant;
                        System.out.println("El valor de su compra actual es: " + compra);
                    }
                }
                case 3 -> {
                    System.out.println("¿Cuántos monitores quiere comprar?");
                    cant = teclado.nextInt();
                    if (cant <= 0) {
                        System.out.println("Cantidad no válida");
                    } else {
                        compra += precioMonitor * cant;
                        System.out.println("El valor de su compra actual es: " + compra);
                    }
                }
                case 4 -> {
                    System.out.println("¿Cuántos discos duros quiere comprar?");
                    cant = teclado.nextInt();
                    if (cant <= 0) {
                        System.out.println("Cantidad no válida");
                    } else {
                        compra += precioDisco * cant;
                        System.out.println("El valor de su compra actual es: " + compra);
                    }
                }
                case 5 -> {
                    System.out.println("¿Cuántas RAM quiere comprar?");
                    cant = teclado.nextInt();
                    if (cant <= 0) {
                        System.out.println("Cantidad no válida");
                    } else {
                        compra += precioRam * cant;
                        System.out.println("El valor de su compra actual es: " + compra);
                    }
                }
                case 6 -> {
                    ivaCalculado = compra * IVA;
                    totalConIva = compra + ivaCalculado;

                    System.out.println("Saliste de la tienda.");
                    System.out.println("Nombre: " + nombreCliente);
                    System.out.println("Teléfono: " + telefonoCliente);
                    System.out.println("Fecha: " + fecha);
                    System.out.println("El valor total de tu factura mas IVA es: " + totalConIva);
                }
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 6);
    }
}
