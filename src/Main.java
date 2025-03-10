import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String fecha;
        String telefono;
        int producto;
        int cantidad=0;
        int valor1=0;
        int valor2=0;
        int valor3=0;
        int valor4=0;
        int valor5=0;
        int Mouse = 0;
        int Teclado=0;
        int Monitor=0;
        int Discoduro=0;
        int Ram=0;
        int subtotal=0;
        double Iva=0;
        int total=0;

        do {
            System.out.println("""
                    -------------------------------
                                Tienda
                    Productos:
                    
                    1.Mouse-80.000
                    2.Teclado-320.000
                    3.Monitor-940.000
                    4.Disco Duro-230.000
                    5.RAM-180.000
                    6.Salir
                    --------------------------------
                    """);
            System.out.println("Ingrese que producto desea comprar: ");
            producto = teclado.nextInt();
            do {
                switch (producto) {
                    case 1: {
                        System.out.println("Ha elegido Mouse, ingresa que cantidad de Mouse que quieres: ");
                        cantidad = teclado.nextInt();
                        Mouse= cantidad+cantidad;
                        valor1 = (cantidad+cantidad) * 80000;
                        System.out.println("compraste: "+cantidad+" Mouse por un costo de: "+valor1);
                    }
                    break;
                    case 2: {
                        System.out.println("Ha elegido Teclado, ingresa que cantidad de Teclados que quieres: ");
                        cantidad = teclado.nextInt();
                        valor2 = (cantidad+cantidad) * 320000;
                        Teclado=cantidad+cantidad;
                        System.out.println("compraste: "+cantidad+" Teclados por un costo de: "+valor1);
                    }
                    break;
                    case 3: {
                        System.out.println("Ha elegido Monitor, ingresa que cantidad de Monitores que quieres: ");
                        cantidad = teclado.nextInt();
                        Monitor=cantidad+cantidad;
                        valor3 = (cantidad+cantidad) * 940000;
                        System.out.println("compraste: "+cantidad+" Monitores por un costo de: "+valor1);
                    }
                    break;
                    case 4: {
                        System.out.println("Ha elegido Disco Duro, ingresa que cantidad de Discos Duros que quieres: ");
                        cantidad = teclado.nextInt();
                        Discoduro=cantidad+cantidad;
                        valor4 = (cantidad+cantidad) * 230000;
                        System.out.println("compraste: "+cantidad+" Discos Duros por un costo de: "+valor1);
                    }
                    break;
                    case 5: {
                        System.out.println("Ha elegido Ram, ingresa que cantidad de tarjetas Ram que quieres: ");
                        cantidad = teclado.nextInt();
                        Ram=cantidad+cantidad;
                        valor5 = (cantidad+cantidad) * 180000;
                        System.out.println("compraste: "+cantidad+" RAMS por un costo de: "+valor1);
                    }
                    break;
                    case 6: {
                        System.out.println("Saliendo...");
                    }
                    break;
                    default: {
                        System.out.println("Obcion invalida ingrese una opcion correcta");
                    }
                    break;
                }
            } while (cantidad < 0);
        }while(producto!=6);
        subtotal= valor1+valor2+valor3+valor4+valor5;
        Iva = subtotal * 0.16;
        total= (int) (subtotal+Iva);
        System.out.println("Ingresa los datos del comprador: ");
        System.out.println("Fecha: ");
        fecha = teclado.next();
        System.out.println("Telefono: ");
        telefono = teclado.next();
        System.out.println("Nombre: ");
        nombre = teclado.next();
        System.out.println("--------------------------------");
        System.out.println("       Tienda Electronica       ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Fecha: "+ fecha);
        System.out.println("Telefono: "+ telefono+"\n");
        System.out.println("Productos: \n"+"Mouse: "+Mouse+"  "+valor1+"\n"+"Teclado: "+Teclado+"  "+valor2+"\n"+"Monitor: "+Monitor+"   "+valor3+"\n"+"Disco Duro: "+Discoduro+"   "+valor4+"\n"+"RAM: "+Ram+"   "+valor5);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Iva: "+Iva);
        System.out.println("Total: "+total);
        System.out.println("--------------------------------");
        }
    }
