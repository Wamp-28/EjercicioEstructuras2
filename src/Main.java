import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vt = 0, sbt = 0, iva = 0;
        int tel, pro, can = 0;
        String fe, nom;

        System.out.println("Ingrese sus datos:");
        System.out.print("Nombre: ");
        teclado.next();
        nom = teclado.nextLine();

        System.out.print("Ingrese su teléfono: ");
        tel = teclado.nextInt();

        System.out.print("Ingrese la fecha (dd-mm-aa): ");
        fe = teclado.next();

        do {
            System.out.println("""
                    Menú de compras:
                    1) Mouse = 80.000
                    2) Teclado = 320.000
                    3) Monitor = 940.000
                    4) Disco Duro = 230.000
                    5) RAM = 180.000
                    6) Salir
                    Ingrese el producto que desea comprar:""");

            pro = teclado.nextInt();
            double vu = switch (pro) {
                case 1 -> 80000;
                case 2 -> 320000;
                case 3 -> 940000;
                case 4 -> 230000;
                case 5 -> 180000;
                case 6 -> 0;
                default -> {
                    System.out.println("Producto desconocido, intente de nuevo.");
                    yield -1;
                }
            };


            if (vu > 0) {
                System.out.print("¿Qué cantidad va a comprar? ");
                can = teclado.nextInt();

                sbt = vu * can;
                iva = sbt * 0.16;
                vt = sbt + iva;
            }

        } while (pro != 6);

        System.out.println("--- Factura de Compra ---");
        System.out.println("Nombre del cliente: " + nom);
        System.out.println("Teléfono del cliente: " + tel);
        System.out.println("Fecha de la factura: " + fe);
        System.out.println("Subtotal: " + sbt);
        System.out.println("IVA (16%): " + iva);
        System.out.println("Valor total: " + vt);

        teclado.close();
    }
}
