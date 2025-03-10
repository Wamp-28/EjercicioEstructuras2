import java.util.Scanner;

public class tiendaTegnologia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, dia, mes, a, telefono;
        int mouse = 0, teclado = 0, monitor = 0, discoDuro = 0, ram = 0;
        int cm = 0, ct = 0, cM = 0, cd = 0, cr = 0, opc;
        double total, total16;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese dia: ");
        dia = scanner.nextLine();

        System.out.print("Ingrese mes: ");
        mes = scanner.nextLine();

        System.out.print("Ingrese año: ");
        a = scanner.nextLine();

        System.out.print("Ingrese su teléfono: ");
        telefono = scanner.nextLine();

        do {
            System.out.println(""" 
                    MENU TIENDA CD
            1. Comprar mouse $80.000
            2. Comprar teclado $320.000
            3. Comprar monitor $940.000
            4. Comprar disco duro $230.000
            5. Comprar ram $180.000
            6. Salir
            Seleccione una opción:""");

            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Cuantos mouse va a comprar: ");
                    cm = scanner.nextInt();
                    if (cm<0){
                        System.out.println("no se pueden vender cantidades negativas");
                    }else{
                       mouse = cm * 80000;
                    }
                    break;
                case 2:
                    System.out.print("Cuantos teclados va a comprar: ");
                    ct = scanner.nextInt();
                    if (ct<0){
                        System.out.println("no se pueden vender cantidades negativas");
                    }else{
                        teclado = ct * 320000;
                    }
                    break;
                case 3:
                    System.out.print("Cuantos monitores va a comprar: ");
                    cM = scanner.nextInt();
                    if (cM<0){
                        System.out.println("no se pueden vender cantidades negativas");
                    }else{
                        monitor = cM * 940000;
                    }
                    break;

                case 4:
                    System.out.print("Cuantos discos duros va a comprar:  ");
                    cd = scanner.nextInt();
                    if (cd<0){
                        System.out.println("no se pueden vender cantidades negativas");
                    }else{
                        discoDuro = cd * 230000;
                    }
                    break;

                case 5:
                    System.out.print("Cuantas ram va a comprar:  ");
                    cr = scanner.nextInt();
                    if (cr<0){
                        System.out.println("no se pueden vender cantidades negativas");
                    }else{
                        ram = cr * 180000;
                    }
                    break;

                case 6:

                    total = mouse + teclado + monitor + discoDuro + ram;
                    total16 = total + (total * 0.16);

                    System.out.println("\tTienda CD ");
                    System.out.println("Nombre: "+ nombre);
                    System.out.println("Telefono: "+ telefono);
                    System.out.println("Fecha: "+ dia + mes+ a);
                    System.out.println("Productos \t\t Cantidad \t\t Valor/unidad \t\t valor total ");
                    System.out.println("mouse \t\t\t\t" + cm + "\t\t\t\t $80.000\t\t\t"+ mouse );
                    System.out.println("teclado\t\t\t\t" + ct + "\t\t\t\t $320.000\t\t\t"+ teclado );
                    System.out.println("monitor \t\t\t" + cM + "\t\t\t\t $940.000\t\t\t"+ monitor );
                    System.out.println("disco duro \t\t\t" + cd + "\t\t\t\t $230.000\t\t\t"+ discoDuro );
                    System.out.println("ram \t\t\t\t" + cr + "\t\t\t\t $180.000\t\t\t"+ ram );

                    System.out.println("valor total: "+ total);
                    System.out.println("valor total + iva: "+ total16);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 6);


        }
    }