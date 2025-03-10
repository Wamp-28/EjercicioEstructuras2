import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion1, opcion2, Cmouse=0, Cteclado=0, Cmonitor=0, Cdiscoduro=0, Cram=0;
        int Pmouse=80000, Pteclado=320000, Pmonitor=940000, Pdiscoduro=230000, Pram=180000, valorTotal=0;
        int Vtmouse=0, Vtteclado=0, Vtmonitor=0,Vtdiscoduro=0, Vtram=0;

        do {
            System.out.println("\n----COMPRA DE TECNOLOGÍA----\n");
            System.out.println("1. Comprar");
            System.out.println("2. Carrito");
            System.out.println("3. Pagar");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: \n");
            opcion1 = teclado.nextInt();

            switch (opcion1) {

                case 1:
                    System.out.println("\n----Comprar----\n");
                    System.out.println("1. Mouse");
                    System.out.println("2. Teclado");
                    System.out.println("3. Monitor");
                    System.out.println("4. Disco duro");
                    System.out.println("5. Ram");
                    System.out.print("Selecciones la opcion del articulo: \n");
                    opcion2 = teclado.nextInt();
                    if(opcion2==1){
                        Cmouse++;
                        valorTotal+=Pmouse;
                        Vtmouse+=Pmouse;
                        System.out.println("Se añadio un mouse al carrito");
                    } else if (opcion2==2) {
                        Cteclado++;
                        valorTotal+=Pteclado;
                        Vtteclado+=Pteclado;
                        System.out.println("Se añadio un teclado al carrito");
                    } else if (opcion2==3) {
                        Cmonitor++;
                        valorTotal+=Pmonitor;
                        Vtmonitor+=Pmonitor;
                        System.out.println("Se añadio un monitor al carrito");
                    }else if (opcion2==4) {
                        Cdiscoduro++;
                        valorTotal+=Pdiscoduro;
                        Vtdiscoduro+=Pdiscoduro;
                        System.out.println("Se añadio un Disco duro al carrito");
                    }else if (opcion2==5) {
                        Cram++;
                        valorTotal+=Pram;
                        Vtram+=Pram;
                        System.out.println("Se añadio una ram al carrito");
                    }
                    break;

                case 2:
                    System.out.println("---Carrito---");
                    System.out.println("Cantidad de Mouse="+Cmouse);
                    System.out.println("Valor unitario de Mouse="+Pmouse);
                    System.out.println("Valor Total de Mouse="+Vtmouse+"\n");
                    System.out.println("Cantidad de Teclado="+Cteclado);
                    System.out.println("Valor unitario de Teclado="+Pteclado);
                    System.out.println("Valor Total de Mouse="+Vtteclado+"\n");
                    System.out.println("Cantidad de Monitor="+Cmonitor);
                    System.out.println("Valor unitario de Monitor="+Pmonitor);
                    System.out.println("Valor Total de Monitor="+Vtmonitor+"\n");
                    System.out.println("Cantidad de Disco duro="+Cdiscoduro);
                    System.out.println("Valor unitario de Disco duro="+Pdiscoduro);
                    System.out.println("Valor Total de Disco duro="+Vtdiscoduro+"\n");
                    System.out.println("Cantidad de Disco duro="+Cdiscoduro);
                    System.out.println("Valor unitario de Disco duro="+Pdiscoduro);
                    System.out.println("Valor Total de Disco duro="+Vtdiscoduro+"\n");

                    System.out.println("Subtotal="+valorTotal);
                    System.out.println("IVA16%="+((valorTotal*16)/100));
                    System.out.println("Valor total="+(valorTotal+((valorTotal*16)/100)));
                    break;

                case 3:
                    Vtmouse=0;
                    Vtteclado=0;
                    Vtmonitor=0;
                    Vtdiscoduro=0;
                    Vtram=0;
                    valorTotal=0;
                    System.out.println("Pago Exitoso");
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");

                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion1 != 4);
    }
}