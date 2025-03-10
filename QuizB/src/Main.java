import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mouse = 80000;
        int teclad= 320000;
        int monitor = 940000;
        int disco = 230000;
        int ram = 180000;
        int cant;
        int opcion;
        String nombreCliente;
        int telefonoCliente;
        String fecha;

        int compra = 0;


        System.out.println("Ingrese su nombre: ");

        nombreCliente = teclado.next();

        System.out.println("Ingrese su telefono: ");

        telefonoCliente = teclado.nextInt();

        System.out.println("Ingrese la fecha: ");

        fecha = teclado.next();


        System.out.println("Bienvenido a la tienda, a continuación el menu de opciones: ");

        do {

        System.out.println("""
                Cual desea comprar:
                1: teclados: 320.000
                2. mouse: 80.000
                3: monitor: 940.000
                4. discos duros: 230.000
                5. Ram: 180.000 
                6. Salir""");

        opcion = teclado.nextInt();





        switch (opcion){

            case 1 ->{
                System.out.println("¿Cuantos teclados quiere comprar? Su valor es de 320.000 ");
                cant = teclado.nextInt();

                if (cant <= 0){
                    System.out.println("Cantidad no valida");
                } else {

                compra = teclad *= cant;
                System.out.println("El valor de su compra es de: " + compra);
                }

            }

            case 2 ->{
                System.out.println("¿Cuantos mouse quiere comprar? Su valor es de 80.000 ");
                cant = teclado.nextInt();
                if (cant <= 0){
                    System.out.println("Cantidad no valida");
                } else {
                compra = mouse *= cant;
                System.out.println("El valor de su compra es de: " + compra);
                }

            }

            case 3 ->{
                System.out.println("¿Cuantos monitores quiere comprar? Su valor es de 940.000 ");
                cant = teclado.nextInt();
                if (cant <= 0){
                    System.out.println("Cantidad no valida");
                } else {
                compra = monitor *= cant;
                System.out.println("El valor de su compra es de: " + compra);
                }
            }

            case 4 ->{
                System.out.println("¿Cuantos discos duros quiere comprar? Su valor es de 230.000 ");
                cant = teclado.nextInt();
                if (cant <= 0){
                    System.out.println("Cantidad no valida");
                } else {
                    disco *= cant;
                    System.out.println("El valor de su compra es de: " + compra);
                }

            }

            case 5 ->{
                System.out.println("¿Cuantas RAM quiere comprar? Su valor es de 180.000 ");
                cant = teclado.nextInt();
                if (cant <= 0){
                    System.out.println("Cantidad no valida");
                } else {
                    ram *= cant;
                    System.out.println("El valor de su compra es de: " + compra);

                }

            }

            case 6 ->{
                System.out.println("""
                        Saliste de la tienda.
                        Nombre: """ + nombreCliente);
                System.out.println("telefono: " + telefonoCliente);
                System.out.println("Fecha: " + fecha);



                System.out.println("El valor de tu factura es de: " + compra);

            }

            default -> {
                System.out.println("Opcion no valida");
            }
        }


        }while (opcion != 6);











        }
    }
