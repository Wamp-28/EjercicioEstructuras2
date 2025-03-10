import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vt, sbt;
        double iva=0.16;
        int tel,pro,can;
        String fe, nom;

        System.out.println("Ingrese sus datos:");
        System.out.println("Nombre:");
        nom= teclado.next();
        System.out.println("Ingrese su telefono: ");
        tel=teclado.nextInt();
        System.out.println("Ingrese la fecha: dd--mm--aa");
        fe= teclado.next();

        do {
            System.out.println("""
                    Menu de comprar:
                    1) mouse = 80.000
                    2) teclados = 320.000
                    3) monitor = 940.000
                    4) Discos Duros = 230.000
                    5) Ram = 180.000
                    6)Salir""");

            pro = teclado.nextInt();
            double vu = switch (pro) {
                case 1 -> 80000;
                case 2 -> 320000;
                case 3 -> 940000;
                case 4 -> 230000;
                case 5 -> 180000;
                default -> {
                    System.out.println("Producto desconocido");
                    yield 0.0;
                }
            };
            iva=vu*iva;
            sbt=vu;
            vt= sbt+iva;
            if (pro==1){
                System.out.println("¿Que cantidad va a comprar?");
                can=teclado.nextInt();
            } else if (pro==2) {
                System.out.println("¿Que cantidad va a comprar?");
                can= teclado.nextInt();
            } else if (pro==3) {
                System.out.println("¿Que cantidad va a comprar?");
                can= teclado.nextInt();
            } else if (pro==4) {
                System.out.println("¿Que cantidad va a comprar?");
                can= teclado.nextInt();
            } else if (pro==5) {
                System.out.println("¿Que cantidad va a comprar?");
                can= teclado.nextInt();
            }
            else  if (pro==6){
                System.out.println("---Tienda Tecno---");
                System.out.println("Nombre del cliente: " + nom);
                System.out.println("Telefono del cliente : " + tel);
                System.out.println("Fecha de la factura: " + fe);
                System.out.println("Valor unitario " + vu);
                System.out.println("Valor total: "+vt);
                System.out.println("Iva 16%: "+iva);
            }
        }while (pro!=6);
    }

}