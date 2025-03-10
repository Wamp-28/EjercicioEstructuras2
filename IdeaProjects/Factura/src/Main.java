import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String producto;
        int cantidad = 0, opcion;
        double precio, subtotal=0, IVA, total=0;

        System.out.println("-----TIENDA TECNOLOGICA-----");
        System.out.println("Ingrese el nombre del cliente");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese numero de telefono");
        String telefono = teclado.nextLine();
        System.out.println("Ingrese la fecha de la compra");
        String fecha = teclado.nextLine();
        IVA = subtotal * 0.16;
        total = subtotal + IVA;

        String continuar;

        do{
            System.out.println("Opciones de compra");
            System.out.println("1. MOUSE, PRECIO: $80.000");
            System.out.println("2. TECLADO, PRECIO: $320.000");
            System.out.println("3. MONITOR, PRECIO: $940.000");
            System.out.println("4. DISCO DURO, PRECIO: $230.000");
            System.out.println("5. RAM, PRECIO: $180.000");
            System.out.println("6. SALIR");
            System.out.println("Ingrese la opcion: ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:{
                    System.out.println("Has seleccionado Mouse por $80.000");
                    precio = 80.000;
                    break;
                }
                case 2:{
                    System.out.println("Has seleccionado Teclado por $320.000");
                    precio = 320.000;
                    break;
                }
                case 3:{
                    System.out.println("Has seleccionado Monitor por $940.000");
                    precio = 940.000;
                    break;
                }
                case 4:{
                    System.out.println("Has seleccionado Disco Duro por $230.000");
                    precio = 230.000;
                    break;
                }
                case 5:{
                    System.out.println("Has seleccionado RAM por $180.000");
                    precio = 180.000;
                    break;
                }
                case 6:{
                    System.out.println("-----FACTURA DE COMPRA -----");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Telefono: " + telefono);
                    System.out.println("Fecha de compra: " + fecha);
                    break;
                }
            }
        }while (opcion !=6);
        teclado.close();


    }
}